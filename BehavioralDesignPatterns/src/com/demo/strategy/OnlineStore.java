package com.demo.strategy;

/**
 * Client Code: Use the ShoppingCart class to perform payments with different strategies.
 * */
public class OnlineStore {

	public static void main(String[] args) {
		
		ShoppingCart cart = new ShoppingCart();
        
        // Pay with a credit card
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9012-3456", "John Doe");
        cart.setPaymentStrategy(creditCardPayment);
        cart.checkout(100);

        // Pay with PayPal
        PaymentStrategy payPalPayment = new PayPalPayment("john.doe@example.com");
        cart.setPaymentStrategy(payPalPayment);
        cart.checkout(50);

	}

}
