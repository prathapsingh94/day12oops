package com.onesoft.day10;

public class UsePen {
	public static void main(String[] args) {
		Refill r = new Refill();
		r.setBrand("Apsara");
		r.setPrice(75);
		r.setColor("red");
		
		Pen p = new Pen();
		p.setBrand("Hero");
		p.setPrice(150);
		p.setRefill(r);
		
		System.out.println(p.getRefill().getBrand());
		System.out.println(p.getBrand());
	}

}
