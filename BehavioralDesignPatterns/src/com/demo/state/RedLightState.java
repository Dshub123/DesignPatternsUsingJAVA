package com.demo.state;

public class RedLightState implements TrafficSignalState {
    
	@Override
    public void display() {
        System.out.println("Red Light: Stop");
    }

    @Override
    public void next(TrafficSignalContext context) {
        System.out.println("Switching to Green Light");
        context.setState(new GreenLightState());
    }
}