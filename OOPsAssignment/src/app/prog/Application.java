package app.prog;
//‘Application’ class like version, technology used, Developer and behaviors like install(),uninstall(). 
public class Application {
		double ver;
		String tech;
		Developer developer;
		public Application() {
			
		}
		public Application(double ver,String tech,Developer developer) {
			this.ver=ver;
			this.tech=tech;
			this.developer=developer;
		}
		
		public double getVer() {
			return ver;
		}
		public void setVer(double ver) {
			this.ver = ver;
		}
		public String getTech() {
			return tech;
		}
		public void setTech(String tech) {
			this.tech = tech;
		}
		public Developer getDev() {
			return developer;
		}
		public void setDev(Developer developer) {
			 this.developer=developer;
		}
		void install() {
			System.out.println("Install");
		}
		void uninstall() {
			System.out.println("Uninstall");
		}
		public String toString() {
			return "Version:"+ver+" Technology:"+tech+" Devloper:"+developer;
		}
}
