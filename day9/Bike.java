package com.onesoft.day9;

public class Bike {
	String brand;
	int price;
	String color;
	boolean isPetrol;
	
	public int netPrice (int discountPer) {
		return price-(price*discountPer/100);
		
	}

}
