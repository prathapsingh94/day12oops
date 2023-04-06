package com.onesoft.day9;

public class UseBike {
	public static void main(String[] args) {
		Bike b1 = new Bike();
		b1.brand ="BMW";
		b1.price =200000;
		b1.color ="black";
		b1.isPetrol =true;
		
		Bike b2 = new Bike();
		b2.brand ="TVS";
		b2.price =150000;
		b2.color ="blue";
		b2.isPetrol =true;
		
	System.out.println("Brand="+b1.brand+"Netprice="+b1.netPrice(10));
	System.out.println("Brand="+b2.brand+"Netprice="+b2.netPrice(10));	
	}

}
