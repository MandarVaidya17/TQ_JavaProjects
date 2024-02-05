package com.finalmethoddispatch;

//Create a class Showroom having showroomid, showroomName
//Create the showroom name as static and final and create a variable space as final
//Initialize the final variable
//Create a final method empRules() and create a class BikeShowRoom which inherits Showroom and try
//to override empRules

class Showroom{
	int shwroomid;
	final static String showroomName;
	static {
		showroomName="SEVA";
	}
	{
		shwroomid=101;
	}
	
	
		final void empRule() {
			System.out.println("Emp rule");
		}
}


class BikeShowRoom extends Showroom{
			
//	final void empRule() {
//		//can't be override
//	}
}

public class ShowroomDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
