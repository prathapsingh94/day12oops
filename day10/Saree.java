package com.onesoft.day10;

public class Saree {
	private String brand;
	private int price;
	private String color;
	private boolean isHeavyWeight;
	
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
	public void setColor(String color) {
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	public void setIsHeavyWeight(boolean isHeavyWeight) {
		this.isHeavyWeight=isHeavyWeight;
	}
	public boolean getIsHeavyWeight() {
		return isHeavyWeight;
	}
	public Saree(String brand, int price, String color, boolean isHeavyWeight) {
		this.brand=brand;
		this.price=price;
		this.color=color;
		this.isHeavyWeight=isHeavyWeight;
	}
	public String toString() {
		return("Brand="+brand+" Price="+price+" Color="+color+" IsHeavyWeight="+isHeavyWeight);
	}
}
