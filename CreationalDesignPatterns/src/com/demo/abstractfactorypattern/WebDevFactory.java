package com.demo.abstractfactorypattern;

public class WebDevFactory extends EmployeeAbstractFactory{

	@Override
	public Employee createEmployee() {
		return new WebDeveloper();
	}
	
	
}
