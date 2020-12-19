package com.io.fitandlift;

import java.math.BigDecimal;
import java.sql.Date;

public class Over60Member extends DefaultMember {
	protected int age;
	
	public Over60Member(String membershipNumber, String name, Date startMembershipDate, BigDecimal annualFee, int age)
	{
		super(membershipNumber, name, startMembershipDate, annualFee);
		this.age = age;
	}
	
	public int getAge() {return age;}
	
	public void setAge(int age) {this.age = age;}
	
	
	@Override
	public String toString() {
		return "Over60Member{" +
				"age=" + age +
				",membershipNumber='" + membershipNumber + '\''+
				",name=" + name + '\'' +
				",startMembershipDate='" + startMembershipDate + '\'' +
				",annualFee" + annualFee +
				"}" + super.toString();
				
		
		
	}	
}