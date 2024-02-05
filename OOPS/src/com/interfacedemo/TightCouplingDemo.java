package com.interfacedemo;

interface Message{
	void sendMessage(String msg);
}

class Whatsapp implements Message{
	String type;
	public Whatsapp() {
		
	}
	@Override
	public void sendMessage(String msg) {
		this.type="Whatsapp";
		System.out.println(type+":"+msg);
		
	}
}

class Telegram implements Message{
	String type;
	public Telegram() {
		
	}
	@Override
	public void sendMessage(String msg) {
		this.type="Telegram";
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
		m=new Whatsapp();
		t1.setNotify(m, "hiii");
		m=new Telegram();
		t1.setNotify(m, "hello");

	}

}
