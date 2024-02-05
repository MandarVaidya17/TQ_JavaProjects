package com.memberinner;
class Bank{
	private static String bname="SBI Bank";
	String bankloc;
	String ifscCode;
	String aName;
	int accNo;
	
	{
		bankloc="Mumbai";
		ifscCode="SBINDE1234";
	}
	public Bank() {
		// TODO Auto-generated constructor stub
	}
	Bank(int accNo,String aName){
		this.accNo=accNo;
		this.aName=aName;
	}
	void displayBankDetails() {
		System.out.println(bname+" "+bankloc);
		System.out.println(ifscCode);
	}
	 // Before Jdk 1.8 we cannot have static variables and method in member inner class

	class Locker{
		int lockerId;
		String pass;
		static float lockerRent= 2000;
		
		public Locker() {
			// TODO Auto-generated constructor stub
		}
		public Locker(int lockerId,String pass) {
			super();
			this.lockerId=lockerId;
			this.pass=pass;
		}
		static void show()
		{
			Bank b1= new Bank();
			System.out.println("This locker belongs to :" + b1.aName + " with accNo:" + b1.accNo);
		}
		public void displayLockerDetails() {
			displayBankDetails();
			System.out.println("this locker belong to"+aName+" with accNO"+accNo);
			System.out.println("locker id:"+lockerId);
			System.out.println("rent to be paid:"+lockerRent);
		}
	}
}
public class BankLockerDemo {
	public static void main(String[] args) {
		Bank cust1= new Bank(1011, "Onkar");
		Bank.Locker lock1= cust1.new Locker(10, "On123");
		
		cust1.displayBankDetails();
		System.out.println("--------------------------------");
		lock1.displayLockerDetails();
		
		System.out.println("---------------------------------------------");
		Bank.Locker lock2= new Bank(201, "Rahul").new Locker(12, "R123");
		lock2.displayLockerDetails();
	}
}
