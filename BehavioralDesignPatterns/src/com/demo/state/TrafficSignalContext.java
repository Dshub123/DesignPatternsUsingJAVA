package com.demo.state;

public class TrafficSignalContext {
	
	private TrafficSignalState currentState;

	public TrafficSignalContext() {
		currentState = new RedLightState(); // Initial state
	}

	public void setState(TrafficSignalState state) {
		currentState = state;
	}

	public void display() {
		currentState.display();
	}

	public void switchToNextState() {
		currentState.next(this);
	}
}
