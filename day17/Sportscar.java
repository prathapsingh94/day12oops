package com.onesoft.day17;

public class Sportscar implements Car {
	public void brand(String brand) {
		System.out.println(brand);
	}
	public void findNetPrice(int price) {
		System.out.println(price+(price*20/100));
	}

}
