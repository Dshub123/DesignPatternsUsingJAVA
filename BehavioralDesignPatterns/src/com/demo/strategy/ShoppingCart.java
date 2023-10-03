package com.demo.strategy;

/*Context Class: Create a context class that holds a reference 
 * to a PaymentStrategy and allows the client to 
 * switch between different payment methods.
 * */

public class ShoppingCart {
	
	private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(int totalAmount) {
        // Process payment using the selected strategy
        paymentStrategy.pay(totalAmount);
    }

}
