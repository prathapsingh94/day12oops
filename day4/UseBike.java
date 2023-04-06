package com.onesoft.day4;

public class UseBike {
	public static void main(String[]args) {
		Bike b1 = new Bike ();
		b1.brand = args[0];
		b1.price = Integer.parseInt(args[1]);
		b1.color = args[2];
		
		Bike b2 = new Bike ();
		b2.brand = args[3];
		b2.price = Integer.parseInt(args[4]);
		b2.color = args[5];
		System.out.println("Brand ="+b1.brand+"\n"+"price ="+b1.price);
	}

}
class Bike {
	String brand;
	int price;
	String color;
}