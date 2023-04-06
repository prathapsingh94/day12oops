package com.onesoft.day17;

public class UseCalculator1 {
	public static void main(String[] args) {
		Calculator1 add = (a,b)->System.out.println(a+b);
		Calculator1 sub =(a,b)->System.out.println(a-b);
		Calculator1 mul =(a,b)->System.out.println(a*b);
		Calculator1 divi =(a,b)->System.out.println(a/b);
		add.math(10, 80);
		sub.math(100, 10);
		mul.math(10, 9);
		divi.math(180, 2);
	}

}
