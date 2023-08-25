package com.demo.prototypepattern;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
		
		NetworkConnection networkCOnnection = new NetworkConnection();
		
		networkCOnnection.setIp("192.168.1.1");
		networkCOnnection.loadVeryImportantData();
		
		System.out.println(networkCOnnection);
		
		//We want new object of network connection
		
		NetworkConnection nc = (NetworkConnection)networkCOnnection.clone();
		
		System.out.println(nc);
		
	}
}
