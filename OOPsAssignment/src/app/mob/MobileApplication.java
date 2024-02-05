package app.mob;

import app.prog.Application;
import app.prog.Developer;
import app.prog.WebApplication;

public class MobileApplication extends Application {
	public MobileApplication() {
		
	}

	public MobileApplication(double ver, String tech, Developer developer) {
		super(ver, tech, developer);
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		return "Web Application Details:"+super.toString();
	}

	
}
