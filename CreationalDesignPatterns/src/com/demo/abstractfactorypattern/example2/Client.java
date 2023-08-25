package com.demo.abstractfactorypattern.example2;

import com.demo.abstractfactorypattern.example2.Instance.Capacity;

public class Client {
	
	private ResourceFactory reFactory;
	
	public Client(ResourceFactory reFactory) {
		this.reFactory = reFactory;
	}
	
	public Instance createServer(Instance.Capacity capacity,int storageMib) {
		Instance instance = reFactory.createInstance(capacity);
		Storage storage = reFactory.createStorage(storageMib);
		instance.attachStorage(storage);
		return instance;
	}
	
	
	public static void main(String[] args) {
	
		Client aws = new Client(new AwsResourceFactory());
		Instance I1 = aws.createServer(Capacity.micro, 20480);
		I1.start();
		I1.stop();
		
		System.out.println("---------------------------------------------------");
		
		Client gcp = new Client(new GoogleResourceFactory());
		Instance I2 = gcp.createServer(Capacity.large, 40880);
		I2.start();
		I2.stop();
	}

}
