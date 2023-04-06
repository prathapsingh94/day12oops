package com.onesoft.day6;

public class Ifcondition {
	public static void main(String[] args) {
		int count = 0;
		for (int i=0; i<=50; i++) {
			if(i%2!=0) {
				count++;
				System.out.println(i);
			}
			
		}
		System.out.println("count ="+count);
	}

}
