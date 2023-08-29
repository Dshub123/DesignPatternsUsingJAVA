package com.demo.decoratorpattern;

import java.util.Base64;

public class Client {

	public static void main(String[] args) {
		Message msg = new TextMessage("Brain is a greatest weapon!!");
		System.out.println(msg.getContent());
		
		Message decorator = new HtmlEncodedMessage(msg);
		System.out.println(decorator.getContent());
		
		//Message decorator2 = new Base64EncodedMessage(msg);
		//System.out.println(decorator2.getContent());
		
		decorator = new Base64EncodedMessage(decorator); //this is called recursive composition
		System.out.println(decorator.getContent());
		
	}

}
