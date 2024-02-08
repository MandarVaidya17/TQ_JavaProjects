package com.example3;

public class GroceryShop {
	
	static void findSupplier(Supplier s[],String itemName)
	{
		System.out.println(itemName);
//		for(Item i:s) {
//			System.out.println(i);
//		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier sups[]=new Supplier[3];
		
		Item i1[]=new Item[3];
		i1[0]=new Item(1,"rice",35);
		i1[1]=new Item(2,"Suger",35);
		i1[2]=new Item(3,"oil",35);
		
		sups[0]=new Supplier(101, "PAblo", 996644221, i1);
		

	    Item i2[]=new Item[2];
		i2[0]=new Item(1,"chocolate",35);
		i2[1]=new Item(2,"candy",35);
		
		sups[1]=new Supplier(102, "sanket", 996644221, i2);
		
		Item i3[]=new Item[2];
		i3[0]=new Item(1,"chocolate",35);
		i3[1]=new Item(2,"oil",35);
		
		sups[2]=new Supplier(102, "sam", 993424221, i3);

		for(Supplier s:sups) {
			System.out.println("supplier:"+"id:-"+s.getSid()+",name-"+s.getSname()+", mobileno-"+s.getMobileNo());
		for(Item i:s.getItem()) {
			System.out.println(i);
		}
		
		}
	}

}
