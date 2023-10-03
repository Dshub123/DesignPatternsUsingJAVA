package com.demo.state;

public class YellowLightState implements TrafficSignalState {
    @Override
    public void display() {
        System.out.println("Yellow Light: Slow Down");
    }

    @Override
    public void next(TrafficSignalContext context) {
        System.out.println("Switching to Red Light");
        context.setState(new RedLightState());
    }
}
