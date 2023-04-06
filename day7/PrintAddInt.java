package com.onesoft.day7;

public class PrintAddInt {
	public static void main(String[] args) {
		int [] ages = new int [4];
		ages[0] = 28;
		ages[1] = 15;
		ages[2] = 35;
		ages[3] = 50;
		int add =0;
		for(int i=0; i<ages.length; i++) {
			add=add+ages[i];
			System.out.println(ages[i]);
		}
		System.out.println(add);
	}

}
