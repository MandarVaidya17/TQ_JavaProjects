package app.prog;
//Developer class has properties, devName, devExperience,skills and methods debugApp(),integrateCode(). 
public class Developer {
		String devName,Skill;
		int devExp;
		
		public Developer() {
			
		}
		public  Developer(String devName,String Skill,int devExp) {
			this.devName=devName;
			this.Skill=Skill;
			this.devExp=devExp;
		}
		void debugApp() {
			System.out.println("Debug App");
		}
		void integrateCode() {
			System.out.println("Integrated Code");
		}
		public String toString() {
			return " DevName:"+devName+" Skills:"+Skill+" Experiance:"+devExp+" Years";
		}
}
