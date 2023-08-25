package com.demo.adapterpattern;

/*
 * A class adapter, works as Two-way adapter
 * */
public class EmployeeClassAdapter extends Employee implements Customer{

	//we are able to use employee class methods because we are extending employee
	@Override
	public String getName() {
		return this.getFullName();
	}

	@Override
	public String getDesignation() {
		return this.getJobTitle();
	}

	@Override
	public String getAddress() {		
		return this.getOfficeLocation();
	}

	
	
}
