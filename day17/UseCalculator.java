package com.onesoft.day17;

public class UseCalculator {
	public static void main(String[] args) {
		Calculator add = (a,b)-> a+b;
		Calculator sub = (a,b)-> a-b;
		Calculator mul = (a,b)-> a*b;
		Calculator divi = (a,b)-> a/b;
		System.out.println(add.math(10, 5));
		System.out.println(sub.math(20, 5));
		System.out.println(mul.math(10, 10));
		System.out.println(divi.math(10, 2));
	}

}
