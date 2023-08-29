package com.demo.decoratorpattern;

//Decorator implements component interface

public class HtmlEncodedMessage implements Message{

	private Message msg;
	
	public HtmlEncodedMessage(Message msg) {
		this.msg = msg;
	}
	
	
	@Override
	public String getContent() {
		return  msg.getContent();
	}
	
	
	
	

}
