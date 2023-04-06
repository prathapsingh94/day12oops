package com.onesoft.day12;

public abstract class Worker {
	String name;
	int id;
	int workingHour;
	int salaryPerhour;
	public abstract void getWork(String job);
	public abstract void calculateSalary(int workingHour,int salaryPerhour);
	
}
