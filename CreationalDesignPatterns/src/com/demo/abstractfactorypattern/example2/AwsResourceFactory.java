package com.demo.abstractfactorypattern.example2;

import com.demo.abstractfactorypattern.example2.Instance.Capacity;

public class AwsResourceFactory implements ResourceFactory{

	@Override
	public Instance createInstance(Capacity capacity) {
		return new Ec2Instance(capacity);
	}

	@Override
	public Storage createStorage(int capMib) {
		return new S3Storage(capMib);
	}
	
	

}
