package com.abstractdemo;

abstract class Language{
	//can have both abstract and concrete method
	abstract void details();
	
	void show() {
		System.out.println("Language");
	}
}

class ProLanguage extends Language{

	@Override
	void details() {
		System.out.println("java,C++,python,ruby");
		
	}
	void display(String name) {
		System.out.println("Institude:"+name);
	}
	
}
class SpeakingLanguage extends Language
{

	@Override
	void details() {
		System.out.println("English,Marathi,French");
		
	}
	
}

public class AbstractDemo1 {

	public static void main(String[] args) {
		//we can not create object of abstract class
		//Language l1=new Language();
		Language lang;
		ProLanguage p1=new ProLanguage();
//		p1.details();
//		p1.display("Agasti");
//		p1.show();
		lang=new ProLanguage();
		lang.details();
		lang.show();
	}

}
