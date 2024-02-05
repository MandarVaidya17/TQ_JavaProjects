package app.prog;

import app.mob.MobileApplication;

public class ApplicationDemo {

	public static void main(String[] args) {
		Developer d=new Developer("Pablo", "JAVA,C++,Reat ", 5);
		Developer d2=new Developer("Sam","Python,Java,Angular ",7);
		
		DesktopApp desk=new DesktopApp(11, "SalesForce", d);
		System.out.println(desk);
		
		WebApplication web=new WebApplication(10.2,"Intel",d2);
		System.out.println(web);
		
		MobileApplication mob=new MobileApplication(11.7,"SpringBoot", d);
		System.out.println(mob);
	}

}
