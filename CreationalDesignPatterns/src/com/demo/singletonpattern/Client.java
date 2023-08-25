package com.demo.singletonpattern;

public class Client {
	
	public static void main(String[] args) {
		EagerRegistry registry = EagerRegistry.getInstance();
		EagerRegistry registry2 = EagerRegistry.getInstance();
		EagerRegistry registry3 = EagerRegistry.getInstance();
		EagerRegistry registry4 = EagerRegistry.getInstance();
		
		System.out.println(registry == registry2);
		//System.out.println(registry+"  "+registry2+"  "+registry3+"  "+registry4);
	
		LazyRegistryWithDCL lazyRegister = LazyRegistryWithDCL.getInstance();
		LazyRegistryWithDCL lazyRegister2 = LazyRegistryWithDCL.getInstance();
		
		System.out.println(lazyRegister == lazyRegister2);
	
	}
}
