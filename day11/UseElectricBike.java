package com.onesoft.day11;

public class UseElectricBike {
	public static void main(String[] args) {
		ElectricBike eb = new ElectricBike();
		eb.brand = "TVS";
		eb.price = 250000;
		eb.colour = "blue";
		eb.batteryCapacity =5000;
		System.out.println(eb.brand+", "+eb.price+", "+eb.batteryCapacity);
	}

}
