package com.demo.facadepattern;

public class Client {

	public static void main(String[] args) {
		
		OrderProcessingFacade facade = new OrderProcessingFacade();
		facade.processOrder();

	}

}
