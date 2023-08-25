package com.demo.adapterpattern;

public class Client {

	public static void main(String[] args) {
		/** Using Class/Two-way adapter **/
		EmployeeClassAdapter classAdapter = new EmployeeClassAdapter();
		populateEmployeeData(classAdapter);
		BusinessCardDesigner desiner = new BusinessCardDesigner();
		String card = desiner.designCard(classAdapter);
		System.out.println(card);
		
		
		/** Using Object adapter **/
		Employee emp = new Employee();
		populateEmployeeData(emp);
		EmployeeObjectAdapter objAdapter = new EmployeeObjectAdapter(emp);
		BusinessCardDesigner desiner2 = new BusinessCardDesigner();
		String card2 = desiner2.designCard(objAdapter);
		System.out.println(card2);
	}
	
	//Helper method
	private static void populateEmployeeData(Employee emp) {
		emp.setFullName("Shubham Diddi");
		emp.setJobTitle("Full Stack Developer");
		emp.setOfficeLocation("Pune");
	}

}
