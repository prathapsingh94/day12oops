package com.onesoft.day5;

public class UseCar {
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.name = "BMW";
		car1.price =2500000;
		
		Car car2 = new Car();
		car2.name = "Audi";
		car2.price =3500000;
		
		if(car1.price < car2.price) {
			System.out.println(car1.name+" Price is low");
		}
		else {
			System.out.println(car2.name+" price is low");
			
		}
		
		
		
	}

}