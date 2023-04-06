package com.onesoft.day12;

public class Programmer extends Worker {
	public void getWork(String job) {
		System.out.println(job);
	}
	public void calculateSalary(int workingHour,int salaryPerhour ) {
		System.out.println(workingHour*salaryPerhour);
	}

}
