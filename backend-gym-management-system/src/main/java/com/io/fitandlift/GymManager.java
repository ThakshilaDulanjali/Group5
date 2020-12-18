package com.io.fitandlift;

public interface GymManager {

		public abstract void addMember();
		public abstract void deleteMember();
		public abstract void updateMember();
		public abstract void sortAndPrintAllMembers();
		public abstract void saveToTextFile();
		public abstract void openGui();
		public abstract  Boolean inputMenu();
		public abstract  Boolean checkavailability(String membershipNum);
		public abstract  Boolean findStudentMember(String membershipNum);
		public abstract  Boolean findOver60Member(String membershipNum);
}		
		


