package com.io.fitandlift;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

public abstract class DefaultMember {
		protected String membershipNumber;
		protected String name;
		protected Date startMembershipDate;
		protected BigDecimal annualFee;
		
		

		public DefaultMember(String membershipNumber, String name, Date startMembershipDate, BigDecimal annualFee) {
			this.membershipNumber = membershipNumber;
			this.name = name;
			this.startMembershipDate = startMembershipDate;
			this.annualFee = annualFee;
			
		}
		
		public String getMembershipNumber() {return membershipNumber;}
		public void setMembershipNumber(String membershipNumber) {this.membershipNumber = membershipNumber;}
		public String getName() {return name;}
		public void setName(String name) {this.name = name;}
		public Date getStartMembershipDate() {return startMembershipDate;}
		public void setStartMembershipDate(Date startMembershipDate) {this.startMembershipDate = startMembershipDate;}
		public BigDecimal getAnualFee() {return annualFee;}
		public void setAnnualFee(BigDecimal annualfee, BigDecimal annualFee) {this.annualFee = annualFee;}
	
		
		
		@Override
		public String toString() {
			return "DefaultMember{"+
					"membershipNumber='" + membershipNumber + '\'' + 
					", name='" + name + '\'' +
					",startMembershipDate='" + startMembershipDate + '\'' +
					",annualFee=" + annualFee +
					')';
		
		}
		
		@Override
		public boolean equals(Object o) {
			if (this == o)return true;
			if (!(o instanceof DefaultMember))return false;
			DefaultMember that = (DefaultMember)o;
			return Objects.equals(membershipNumber, that.membershipNumber)&&
					Objects.equals(name, that.name)&&
					Objects.equals(startMembershipDate,  that.startMembershipDate)&&
					Objects.equals(annualFee, that.annualFee);
		}
		
		
}
