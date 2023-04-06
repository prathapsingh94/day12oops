package com.onesoft.day7;

public class PrintMultiInt {
	public static void main(String[] args) {
		int [] ages = new int [4];
		ages[0] = 28;
		ages[1] = 15;
		ages[2] = 35;
		ages[3] = 50;
		int multi =1;
		for(int i=0; i<ages.length; i++) {
			multi=multi*ages[i];
			System.out.println(ages[i]);
		}
		System.out.println(multi);
	}


}
