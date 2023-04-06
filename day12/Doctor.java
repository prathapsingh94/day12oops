package com.onesoft.day12;

public abstract class Doctor implements Human {
	public void eat(String food) {
		System.out.println(food);
	}
	public abstract void workForLiving(String job);
	public abstract void showSalary(int salary);

}
