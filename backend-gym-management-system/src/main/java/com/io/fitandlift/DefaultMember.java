package com.io.fitandlift;

public abstract class DefaultMember {
		protected String membershipNumber;
		protected String name;
		protected Date startMembershipDate;
		protected DigDecimal annualFee;
		
		
		public DefaultMember(String membershipNumber, String name,Date startMembershipDate, DigDecimal annualFee) {
			this.membershipNumber = membershipNumber;
			this.name = name;
			this.startMembershipDate = startMembershipDate;
			this.annualFee = annualFee;
			
		}
		
		public String getMembershipNumber() {return membershipNumber;}
		public void setMembershipNumber(String membershipNumber) {this.membershipNumber = membershipNumber;}
		public string getName() {return name;}
		public void setName(String name) {this.name = name;}
		public Data getstartMembershipDate() {return startMembershipDate;)
		public void setStartMembershipDate(Date startMembershipDate) {this.startMembershipDate = startmembershipDate;}
		public DigDecimal getAnualFee() {return annualFee;}
		publiv void setAnnualFee(DigDecimal annualfee) {this.annualFee = annualFee;}
		
		
		
		@override
		public String toString() {
			return "DefaultMember{"+
					"membershipNumber = " + membershipNumber + " \ " + 
					", name " + name + " \ " +
					",startMembershipDate = " + startMembershipDate + " \ " +
					",annualFee" + annualFee +
					"{" + super.toString();
		
		}
		
		
}
