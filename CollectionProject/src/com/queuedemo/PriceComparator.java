package com.queuedemo;

import java.util.Comparator;

public class PriceComparator implements Comparator<Boook> {

	@Override
	public int compare(Boook o1, Boook o2) {
		return (int) (o1.getPrice()-o2.getPrice());
	}
	

}
