package com.demo.observer;

public class Client {

    public static void main(String[] args) {
    	
    	Order order = new Order("45");
    	
    	PriceObserver price = new PriceObserver();
    	order.attach(price);
    	
    	QuantityObserver quant = new QuantityObserver();
    	order.attach(quant);
    	
    	order.addItem(123);
    	order.addItem(889);
    	
    	System.out.println(order);
    }
}
