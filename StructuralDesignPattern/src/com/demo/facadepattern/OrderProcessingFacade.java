package com.demo.facadepattern;

public class OrderProcessingFacade {
	
	private OrderVerification orderVerification;
    private PaymentProcessing paymentProcessing;

    public OrderProcessingFacade() {
    	
        this.orderVerification = new OrderVerification();
        this.paymentProcessing = new PaymentProcessing();
    
    }

    public void processOrder() {
    	
        orderVerification.verifyOrder();
        paymentProcessing.processPayment();
    
    }

}
