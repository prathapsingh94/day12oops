package com.onesoft.day10;

public class UseWatch {
	public static void main(String[] args) {
		Battery b = new Battery();
		b.brand ="Cello";
		b.capacity=1000;
		b.duration =24;
		b.price = 2500;
		
		Watch w = new Watch();
		w.brand ="Fasttrack";
		w.price = 3000;
		w.color = "black";
		w.battery =b;
	
		
		System.out.println("Watch brand= "+w.brand);
		System.out.println("Watch battery brand= "+w.battery.brand+", "+w.battery.price);
	}

}
