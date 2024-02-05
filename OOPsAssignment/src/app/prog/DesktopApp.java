package app.prog;

public class DesktopApp extends Application {
	public DesktopApp() {
		
	}

	public DesktopApp(double ver, String tech, Developer developer) {
		super(ver, tech, developer);
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		return "DesktopApp Details:"+super.toString();
	}
	
}
