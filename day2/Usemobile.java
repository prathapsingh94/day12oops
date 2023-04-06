package com.onesoft.day2;

public class Usemobile {
	public static void main(String[]args) {
		Mobile m = new Mobile ();
		m.brand ="Nokia";
		m.colour ="Black";
		m.price = 15000;
		m.iswaterproof = true;
		m.internalmem = 60;
		System.out.println("Brand="+m.brand+" "+"\nColour="+m.colour+" "+"\nPrice="+m.price+" "+"\nMemory="+m.internalmem);
	}

}
