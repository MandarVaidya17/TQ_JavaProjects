package com.demo.object;

public class Item {
	static double discount;
	static String brand;
	static int icount=0;
	
	static {
		System.out.println("my grocery shop..");
	}
	static {
		System.out.println("dicount all item");
		discount=0.1;
		brand="Patanjali";
	}
	
	{
		System.out.println("Instance block");
		brand="nestle";
		System.out.println("item added..");
		icount++;
		}
	Item(){
		brand="saffola";
	}

	
	
}
