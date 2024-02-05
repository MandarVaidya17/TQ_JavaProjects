package com.finalmethoddispatch;
//Create a class Game having the method rules() and noOfPlayers(). Create a class BasketBall, Soccer, Cricket
//which are child class of Game. Override the above methods and use dynamic method dispatch
//to show thw rules and noofPlayers according to the object passed

class Game{
		int noplay=0;
	void rules() {
		System.out.println("Rule:");
	}
	void noOfPlayers() {
		System.out.println("Players:"+noplay);
	}
}

class Basketball extends Game{
	void rules() {
		System.out.println("Rule: basketball");
	}
	void noOfPlayers() {
		int noplay=12;
		System.out.println("Players:"+noplay);
	}
}

class Soccer extends Game{
	void rules() {
		System.out.println("Rule:soccer");
	}
	void noOfPlayers() {
		int noplay=14;
		System.out.println("Players:"+noplay);
	}
}

class Cricket extends Game{
	void rules() {
		System.out.println("Rule:cricket");
	}
	void noOfPlayers() {
		int noplay=11;
		System.out.println("Players:"+noplay);
	}
}

public class GameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game g;
		g=new Basketball();
		g.rules();
		g.noOfPlayers();
		g=new Soccer();
		g.rules();
		g.noOfPlayers();
		g=new Cricket();
		g.rules();
		g.noOfPlayers();
		
	}

}
