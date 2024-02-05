package com.interfacedemo;

abstract class Message{
	abstract void sendMessage(String msg);
}

class Emp extends Message{
	String type;
	public Emp() {
		
	}
	@Override
	public void sendMessage(String msg) {
		this.type="Employee";
		System.out.println(type+":"+msg);
		
	}
}

class Student1 extends Message{
	String type;
	public Student1() {
		
	}
	@Override
	public void sendMessage(String msg) {
		this.type="Student";
		System.out.println(type+":"+msg);
	}
}
public class TightCouplingDemo {
	
	public void setNotify(Message msg,String m) {
		msg.sendMessage(m);
	}

	public static void main(String[] args) {
		Message m;
		TightCouplingDemo t1=new TightCouplingDemo();
		m=new Emp();
		t1.setNotify(m, " Work");
		m=new Student1();
		t1.setNotify(m, " Study");

	}

}


