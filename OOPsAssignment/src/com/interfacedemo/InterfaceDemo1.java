package com.interfacedemo;
//Write a Java program to create an interface Playable with a method play() that takes no arguments 
//and returns void. 
//Create three classes Football, Volleyball, and Basketball that implement the Playable interface 
//and override the play() method to play the respective sports.
interface Playable{
	void play();
}
class Football implements Playable{

	@Override
	public void play() {
		System.out.println("Playing Football..");	
	}
}

class Volleyball implements Playable{

	@Override
	public void play() {
		System.out.println("Playing Volleyball...");
		
	}
	
}

class Basketball implements Playable{

	@Override
	public void play() {
		System.out.println("Playing Basketball..");
		
	}
	
}
public class InterfaceDemo1 {

	public static void main(String[] args) {
		Playable p1;
		p1=new Football();
		p1.play();
		p1=new Volleyball();
		p1.play();
		p1=new Basketball();
		p1.play();

	}

}
