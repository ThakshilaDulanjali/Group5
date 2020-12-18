package com.io.fitandlift;

import java.math.BigDecimal;
import java.sql.Date;

public class Over60Member extends DefaultMember {
	protected int age;
	
	public Over60Member(String membershipNumber, String name, Date startMembershipDate, BigDecimal annualFee, int age)
	{
		super();
		this.age = age;
	}
	
	public int getAge() {return age;}
	
	public void setAge(int age) {this.age = age;}
	
	
	@Override
	public String toString() {
		
		String membershipNumber = null;
		String name = null;
		String startMembershipDate = null;
		String annualFee = null;
		return "Over60Member{" +
				"age=" + age +
				",membershipNumber='" + membershipNumber + '\''+
				",name=" + name + '\'' +
				",startMembershipDate='" + startMembershipDate + '\'' +
				",annualFee" + annualFee +
				"}" + super.toString();
				
		
		
	}	
}
