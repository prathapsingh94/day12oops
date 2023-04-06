package com.onesoft.day8;

public class UseCar {
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.brand ="maruthi";
		car1.model ="Swift";
		car1.price =800000;
		car1.mileage =21;
		car1.isPetrol =true;
		
		Car car2 = new Car();
		car2.brand ="tata";
		car2.model ="nano";
		car2.price =600000;
		car2.mileage =18;
		car2.isPetrol =true;
		
		Car car3 = new Car();
		car3.brand ="Huyundai";
		car3.model ="verna";
		car3. price =800000;
		car3.mileage =21;
		car3.isPetrol =true;
		
		Car car4 = new Car();
		car4.brand ="Honda";
		car4.model ="city";
		car4.price =900000;
		car4.mileage =20;
		car4.isPetrol =true;
		
		Car[] cars = {car1,car2,car3,car4};
		for(Car c: cars) {
			if(c.mileage>20) {
				System.out.println("milage lower than 20  "+c.brand);
			}
		}
		Car temp = cars[0];
		for(Car c: cars) {
			if(c.price>temp.price) {
				temp=c;
				System.out.println("Maximun price of the car is "+temp.brand);
			}
		}
		Car temp1=cars[0];
		for(Car c: cars) {
			if(c.price<temp1.price) {
				temp1=c;
				System.out.println("Minimum price of the car is "+temp1.brand);
			}
		}
	
	}

}
