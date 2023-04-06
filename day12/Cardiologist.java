package com.onesoft.day12;

public class Cardiologist extends Doctor  {
	int experience;
	public void workForLiving(String job) {
		System.out.println(job);
	}
	public void showSalary(int salary) {
		if(experience>0 && experience<4) {
		System.out.println("450000 per annum");
	}
		else {
			System.out.println("780000 per annum");
		}
	}
	public void sleep(String hour) {
		System.out.println(hour);
	}
	public void walk(int walk) {
		System.out.println(walk);
	}

}
