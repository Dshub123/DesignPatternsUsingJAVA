package com.demo.abstractfactorypattern;

public class EmployeeFactory {
	
	//get employee
	
	public static Employee getEmployee(EmployeeAbstractFactory factory) {
		return factory.createEmployee();
	}
}
