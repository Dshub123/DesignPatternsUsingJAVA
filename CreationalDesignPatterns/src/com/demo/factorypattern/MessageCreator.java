package com.demo.factorypattern;

/*
 * This is our abstract "creator"
 * The abstract method createMessage() has to be implemented by
 * its subclass.
 * */
public abstract class MessageCreator {
	
	public Message getMessage() {
		Message msg = createMessage();
		
		msg.addDefaultHeaders();
		msg.encrypt();
		return msg;
	}
	
	//Factory Method
	public abstract Message createMessage();
		
}
