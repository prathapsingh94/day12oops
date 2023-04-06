package com.onesoft.day10;

public class Pen {
	private String brand;
	private int price;
	private Refill refill;
	
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
	public void setRefill(Refill refill) {
		this.refill=refill;
	}
	public Refill getRefill() {
		return refill;
	}

}
