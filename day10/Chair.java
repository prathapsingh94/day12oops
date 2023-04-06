package com.onesoft.day10;

public class Chair {
	private String brand;
	private int price;
	private Wood wood;
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	public void setWood(Wood wood) {
		this.wood=wood;
	}
	public Wood getWood() {
		return wood;
	}
}
