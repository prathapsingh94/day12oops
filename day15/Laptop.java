package com.onesoft.day15;

public class Laptop {
	private String brand;
	private int price;
	private String processor;
	private boolean isTouch;
	private String color;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public boolean isTouch() {
		return isTouch;
	}
	public void setTouch(boolean isTouch) {
		this.isTouch = isTouch;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Laptop(String brand, int price, String processor, boolean isTouch, String color) {
		super();
		this.brand = brand;
		this.price = price;
		this.processor = processor;
		this.isTouch = isTouch;
		this.color = color;
	}
	public String toString() {
		return "Laptop [brand=" + brand + ", price=" + price + ", processor=" + processor + ", isTouch=" + isTouch
				+ ", color=" + color + "]";
	}
	
	

}
