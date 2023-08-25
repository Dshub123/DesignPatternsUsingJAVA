package com.demo.adapterpattern;

public class EmployeeObjectAdapter implements Customer{

	//Composition is used in object adapter 
	private Employee adaptee;
	
	public EmployeeObjectAdapter(Employee emp) {
		this.adaptee = emp;
	}
	
	@Override
	public String getName() {
		return adaptee.getFullName();
	}

	@Override
	public String getDesignation() {
		return adaptee.getJobTitle();
	}

	@Override
	public String getAddress() {
		return adaptee.getOfficeLocation();
	}
	
	

}
