package com.demo.factorypattern;

public class JSONMessageCreator extends MessageCreator{

	@Override
	public Message createMessage() {
		
		return new JSONMessage();
	}

}
