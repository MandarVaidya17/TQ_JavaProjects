package app.prog;

public class WebApplication extends Application {
	public WebApplication() {
		
	}

	public WebApplication(double ver, String tech, Developer developer) {
		super(ver, tech, developer);
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		return "Web Application Details:"+super.toString();
	}

	}

