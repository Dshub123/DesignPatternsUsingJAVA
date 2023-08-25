package com.demo.abstractfactorypattern.example2;

//Represents a concrete product in a family "Google Cloud Platform"
public class GoogleComputingEngineInstance implements Instance{
	
	
	public GoogleComputingEngineInstance(Capacity capacity) {
		//Map capacity to GCP compute instance types. Use GCP API to provision
		System.out.println("Created Google Compute Engine instance");
	}
	
	@Override
	public void start() {
		System.out.println("Compute engine instance started");
		
	}

	@Override
	public void attachStorage(Storage storage) {
		System.out.println("Attached "+storage+" to Compute engine instance");
		
	}

	@Override
	public void stop() {
		System.out.println("Compute engine instance stopped");		
	}
	
	

}
