package com.mapdemo.hashmapdemo;

import java.util.Map;
import java.util.TreeMap;

public class CustomerOrderTreeMap {
	public static void main(String[] args) {
		TreeMap<Order, Customer> tm=new TreeMap<Order, Customer>(new PriceComparator());
		tm.put(new Order(102, "Burger", 500), new Customer(1, "Pablo", 987987748));
		tm.put(new Order(103, "fries", 100), new Customer(2, "Anita", 677987764));
		tm.put(new Order(101, "pizza", 800), new Customer(3, "Mandar", 996608763));
		tm.put(new Order(105, "Jiuce", 250), new Customer(1, "Pablo", 987987748));
		tm.put(new Order(104, "Brownie",200), new Customer(2, "Anita", 677987764));
		//tm.put(new Order(102, "Burger", 500), new Customer(1, "Pablo", 987987748));

		for(Map.Entry<Order, Customer> e:tm.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
			System.out.println("---------------------------------");
		}
	}

}
