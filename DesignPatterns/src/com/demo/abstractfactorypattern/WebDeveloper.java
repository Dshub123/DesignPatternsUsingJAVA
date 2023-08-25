package com.demo.abstractfactorypattern;

public class WebDeveloper implements Employee{

	@Override
	public int salary() {
		return 60000;
	}

	@Override
	public String name() {
		return "I am Web Developer";
	}

	
}
