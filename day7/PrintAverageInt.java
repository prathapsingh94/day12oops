package com.onesoft.day7;

public class PrintAverageInt {
	public static void main(String[] args) {
		int [] ages = new int [5];
		ages[0] = 26;
		ages[1] = 20;
		ages[2] = 25;
		ages[3] = 30;
		ages[4]= 35;
		int add =0;
		int count=0;
		for(int i=0; i<ages.length; i++) {
			add=add+ages[i];
			count++;
		}
		System.out.println(add/count);
	}


}
