package com.demo.strategy;

public class PayPalPayment implements PaymentStrategy {
    
	private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(int amount) {
        // Implement the PayPal payment logic here
        System.out.println("Paid $" + amount + " with PayPal: " + email);
    }
}