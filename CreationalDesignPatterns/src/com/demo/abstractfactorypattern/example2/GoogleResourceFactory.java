package com.demo.abstractfactorypattern.example2;

import com.demo.abstractfactorypattern.example2.Instance.Capacity;

public class GoogleResourceFactory implements ResourceFactory{

	@Override
	public Instance createInstance(Capacity capacity) {
		return new GoogleComputingEngineInstance(capacity);
	}

	@Override
	public Storage createStorage(int capMib) {
		return new GoogleCloudStorage(capMib);
	}
	
	

}
