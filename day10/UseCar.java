package com.onesoft.day10;

public class UseCar {
	public static void main(String[] args) {
		Engine e = new Engine();
		e.brand = "ford";
		e.enginecc = 1700;
		e.price = 25000;
		
		Car c = new Car();
		c.brand = "BMW";
		c.price = 2500000;
		c.engine = e;
		
		Engine e2 = new Engine();
		e2.brand = "alpha";
		e2.enginecc = 1800;
		e2.price = 35000;
		
		Car c2 = new Car();
		c2.brand = "Audi";
		c2.price = 3500000;
		c2.engine = e2;
		
		Engine e3 = new Engine();
		e3.brand = "Polo";
		e3.enginecc = 2000;
		e3.price = 300000;
		
		Car c3 = new Car();
		c3.brand = "Vvogen";
		c3.price = 2500000;
		c3.engine =e3;
		
		Car[] cars = {c,c2,c3};
		for(int i=0; i<cars.length; i++) {
			if(cars[i].engine.brand.startsWith("a")) {
				System.out.println("car brand="+cars[i].brand);
			}
		}
		
		System.out.println("car brand = "+c.brand);
		System.out.println("engine brand = "+c.engine.brand);
	}

}
