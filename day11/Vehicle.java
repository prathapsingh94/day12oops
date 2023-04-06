package com.onesoft.day11;

public class Vehicle {
	String brand;
	int price;
	public String findNetPrice(int price) {
		return "netPrice="+(price+(price*10/100));
	}

}
