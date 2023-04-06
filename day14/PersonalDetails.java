package com.onesoft.day14;

public class PersonalDetails {
	
	private String name;
	private int age;
	private long aadhar;
	private String gender;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getAadhar() {
		return aadhar;
	}
	public void setAadhar(long aadhar) {
		this.aadhar = aadhar;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	
	public PersonalDetails(String name, int age, long aadhar, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.aadhar = aadhar;
		this.gender = gender;
	}
	
	public String toString() {
		return "PersonalDetails [name=" + name + ", age=" + age + ", aadhar=" + aadhar + ", gender=" + gender + "]";
	}
	
}
