package com.onesoft.day9;

public class UseStudent {
	public static void main(String[] args) {
		StudentAverage std = new StudentAverage();
		System.out.println(std.total(50, 60, 70, 80, 90));
		std.findAverage(50, 60, 70, 80, 90);
	}

}
