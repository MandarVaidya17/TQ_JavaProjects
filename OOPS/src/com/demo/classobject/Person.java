package com.demo.classobject;

public class Person {

	int personid;
	String personame;
	int personage;
	
	public void setData(int personid,String personame,int personage) {
		this.personid=personid;
		this.personame=personame;
		this.personage=personage;
	}
	
	public void displayData() {
		System.out.println("ID:"+personid);
		System.out.println("Name:"+personame);
		System.out.println("Age:"+personage);
	}
}
