package com.enumdemo1;

enum Season{SUMMER,WINTER,MANSOON};

public class EnumDemo2 {
	public static void main(String[] args) {
		Season s=Season.SUMMER;
		switch(s){
			case SUMMER: System.out.println("Cotton clothes");
			break;
			case WINTER: System.out.println("Woolen clothes");
			break;
			case MANSOON:System.out.println("Umbella and raincoat");
			break;
			default: System.out.println("error");
		}
	}
}
