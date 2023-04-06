package com.onesoft.day10;

public class Usechair {
	public static void main(String[] args) {
		Wood w = new Wood();
		w.setType("Neam");
		w.setColor("dark");
		w.setPrice(300);
		
		Chair c = new Chair();
		c.setBrand("Natraj");
		c.setPrice(2500);
		c.setWood(w);
		
		System.out.println(c.getWood().getType());
		System.out.println(c.getBrand()+", "+c.getPrice());
	}

}
