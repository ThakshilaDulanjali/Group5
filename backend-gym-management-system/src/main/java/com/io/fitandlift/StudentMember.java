package com.io.fitandlift;

import java.math.BigDecimal;
import java.util.Date;

public class StudentMember extends DefaultMember {
	protected String schoolName;
	
	
	public StudentMember(String membershipNumber, String name, Date startMembershipDate, BigDecimal annualFee, String schoolName ) {
		super(schoolName, schoolName, startMembershipDate, annualFee);
		this.schoolName = schoolName;
	}


	public String getSchoolName() { return schoolName; }


	public void setSchoolName(String schoolName) { this.schoolName = schoolName; }
	
	@Override
	public String toString() {
		String membershipNumber = null;
		String name = null;
		String startMembershipDate = null;
		String annualFee = null;
		return "StudentMember{" +
	           "SchoolName='" + schoolName + '\'' +
	           ", membershipNumber='" + membershipNumber + '\'' +
	           ", name='" + name + '\'' +
	           ", startMembershipDate='" + startMembershipDate + '\'' +
	           ", annualFee=" + annualFee +
	           "} " + super.toString(); 
	           
	    
	}
}
