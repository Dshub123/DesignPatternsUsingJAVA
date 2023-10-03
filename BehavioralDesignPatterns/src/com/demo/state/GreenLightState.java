package com.demo.state;

public class GreenLightState implements TrafficSignalState {
    @Override
    public void display() {
        System.out.println("Green Light: Go");
    }

    @Override
    public void next(TrafficSignalContext context) {
        System.out.println("Switching to Yellow Light");
        context.setState(new YellowLightState());
    }

}