package com.demo.command;

public class Client {

	public static void main(String[] args) {
        
		// Create receiver objects
        Light livingRoomLight = new Light();
        Fan bedroomFan = new Fan();

        // Create concrete command objects and associate them with receivers
        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);
        Command fanOn = new FanOnCommand(bedroomFan);
        Command fanOff = new FanOffCommand(bedroomFan);

        // Create the remote control
        RemoteControl remote = new RemoteControl();

        // Turn on the light
        remote.setCommand(lightOn);
        remote.pressButton();

        // Turn off the light
        remote.setCommand(lightOff);
        remote.pressButton();

        // Turn on the fan
        remote.setCommand(fanOn);
        remote.pressButton();

        // Turn off the fan
        remote.setCommand(fanOff);
        remote.pressButton();
    }
}
