package com.inheritnce;
interface Demo{
	void display();
}
interface Parent1 extends Demo{
	void demo();
}
interface Parent2 extends Demo{
	void demo();
}
public class DiamondProb implements Parent1,Parent2 {

	@Override
	public void demo() {
		
		
	}

	@Override
	public void display() {
		
		
	}

}
