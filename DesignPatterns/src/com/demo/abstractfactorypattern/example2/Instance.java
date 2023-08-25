package com.demo.abstractfactorypattern.example2;

//Represents abstract product
public interface Instance {
	
	enum Capacity{micro, samll, large}
	
	void start();
	
	void attachStorage(Storage storage);
	
	void stop();

}
