package com.demo.chainofresponsibility;

import com.demo.chainofresponsibility.LeaveApplication.Status;

//A concrete Handler
public class ProjectLead extends Employee{

	public ProjectLead( LeaveApprover successor) {
		super("Project Lead", successor);
		
	}

	@Override
	protected boolean processRequest(LeaveApplication application) {
		//type of leave & duration is less than or equal to 2 days
		
		if(application.getType() == LeaveApplication.Type.Sick) {
			if(application.getNoOfDays() <=2) {
				application.approve(getApproverRole());
				return true;
			}
		}
		return false;
	}
	
	

}
