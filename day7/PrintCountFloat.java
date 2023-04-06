package com.onesoft.day7;

public class PrintCountFloat {
	public static void main(String[] args) {
		float [] ages = new float [4];
		ages[0] = 28.25f;
		ages[1] = 15.25f;
		ages[2] = 35.30f;
		ages[3] = 50.40f;
		int count =0;
		for(int i=0; i<ages.length; i++) {
			count++;
		}
		System.out.println(count);
	}


}
