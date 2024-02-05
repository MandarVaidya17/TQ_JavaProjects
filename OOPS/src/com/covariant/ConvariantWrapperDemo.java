package com.covariant;
class First{
	//Number value;
	
//	Number displayValue() {
//		value=10;
//		return value;
//	}
	
	Object value;
	
	Object displayValue() {
		value=10;
		return value;	
	}
}
class Second extends First{
	
	Integer myVal;
	
	Integer displayValue() {
		myVal=20;
		return myVal;	
	}
}

class Third extends First{
	Character ch;
	
	Character displayValue() {
		ch='A';
		return ch;	
	}
}

public class ConvariantWrapperDemo {
	public static void main(String[] args) {
		First f1;
		f1=new First();
		Second s;
		Second s1=new Second();
		//f1=s1.displayValue();
		System.out.println(s1.displayValue()+10);
		
	}
}
