package com.onesoft.day5;

public class Sum3 {
	public static void main(String[] args) {
		int n1 = 80;
		int n2 = 75;
		int n3 = 60;
		if(n1>n2 && n1>n3) {
			System.out.println(n1+" is greater");
		}
		else if(n2>n1 && n2>n3) {
			System.out.println(n2+" is greater");
		}
		else {
			System.out.println(n3+" is greater");
			
		}
	}

}
