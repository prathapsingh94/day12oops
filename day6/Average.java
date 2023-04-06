package com.onesoft.day6;

public class Average {
	public static void main(String[] args) {
		int count =0;
		int add =0;
		for (int i=0; i<=10; i++) {
			add = add+i;
			count++;
		}
		System.out.println(add/count);
	}

}
