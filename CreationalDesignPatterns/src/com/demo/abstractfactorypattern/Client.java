package com.demo.abstractfactorypattern;

public class Client {

	public static void main(String[] args) {


		//I want android developer
		Employee e1 = EmployeeFactory.getEmployee(new AndroidDevFactory());
		//System.out.println(e1);
		System.out.println(e1.name());
		System.out.println(e1.salary());
		
		//I want web developer
		Employee e2 = EmployeeFactory.getEmployee(new WebDevFactory());
		System.out.println(e2.name());
		System.out.println(e2.salary());
	}

}
