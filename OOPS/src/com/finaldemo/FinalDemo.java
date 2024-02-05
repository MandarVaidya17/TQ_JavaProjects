package com.finaldemo;
class Developer{
	int id;
	String name;
	final static int noOfHourse;
	final String panNo;
	static {
		noOfHourse=8;
	}
	public Developer() {
		
		this.panNo="Unknown";
			}
	
	public Developer(int id,String name,String panNO) {
		this.panNo = "";
		this.id=id;
		this.name=name;
	}
	void display() {
		System.out.println(id+" "+name+" "+panNo);
	}
}

class FSDev extends Developer{
	void display() {
		System.out.println(id+" "+name+" "+panNo);
	}
}



public class FinalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Developer d=new Developer(101, "mandar", "nfd09090");
		//System.out.println(d);
	}

}
