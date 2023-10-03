package com.demo.state;

//state interface
public interface TrafficSignalState {
	
	void display();
	
	void next(TrafficSignalContext context);

}
