package com.demo.singletonpattern;


/*
 * This class demonstration singleton pattern using Double checked Locking or "classic" singleton
 * This is also a lazy initializing singleton.
 * */
public class LazyRegistryWithDCL {

	private LazyRegistryWithDCL() {
		
	}
	
	//volatile forces value read/write from main memory instead of cache
	private static volatile LazyRegistryWithDCL INSTANCE;
	
	public static LazyRegistryWithDCL getInstance() {
		if(INSTANCE == null) {
			//synchronized because all threads will get same object
			synchronized(LazyRegistryWithDCL.class) {
				if(INSTANCE == null) {
					INSTANCE = new LazyRegistryWithDCL();
					return INSTANCE;
				}
			}
		}
		
		return INSTANCE;
	}
}
