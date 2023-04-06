package com.onesoft.day12;

public class Teacher implements Employee {
	public String name(String a) {
		return a;
	}
	public String id(int b) {
		if(b%2==0) {
			
		return b+" is even number";
	}
		else {
			return b+" is odd number";
		}
	}
	public boolean isMale(boolean c) {
		return c;
	}

}
