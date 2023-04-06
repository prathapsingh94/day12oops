package com.onesoft.day13;

public class Employee {
	private String name;
	private int id;
	private int salary;
	private String role;
	private boolean isMale;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public boolean getIsMale() {
		return isMale;
	}
	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}
	public Employee(String name, int id, int salary, String role, boolean isMale) {
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.role = role;
		this.isMale = isMale;
	}
	public String toString() {
		return "Name "+getName()+" ID "+getId()+" salary "+getSalary()+" role "+getRole()+" ismale "+getIsMale();
	}

}
