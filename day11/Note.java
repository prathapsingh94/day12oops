package com.onesoft.day11;

public class Note extends Stationary {
	boolean isRuled;
	boolean isLong;
	public Note(String brand,int price,String color,boolean isRuled,boolean isLong) {
		super(brand,price,color);
		this.isRuled=isRuled;
		this.isLong=isLong;
	}
public String toString() {
	return super.toString()+", Ruled="+isRuled+", long="+isLong;
}
}
