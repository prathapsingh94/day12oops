package com.onesoft.day11;

public class UseSportsCar {
	public static void main(String[] args) {
		SportsCar sc = new SportsCar();
		sc.brand="Ferrari";
		sc.price=5000;
		sc.isPetrol=true;
		sc.weight=10.5f;
		System.out.println(sc.findNetPrice(sc.price));
		
	}

}
