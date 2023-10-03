package com.demo.state;

public class Client {
	
	public static void main(String[] args) {
		
		TrafficSignalContext trafficSignal = new TrafficSignalContext();

        trafficSignal.display();
        trafficSignal.switchToNextState();

        trafficSignal.display();
        trafficSignal.switchToNextState();

        trafficSignal.display();
        trafficSignal.switchToNextState();

        // Repeat to see the cycling of traffic lights...
		
		
		
	}

}
