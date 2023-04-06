package com.onesoft.day6;

public class PrimeNumber {
	public static void main(String[] args) {
		int num = 7;
		boolean isprime =true;
		for(int i =2; i<num; i++) {
			if(num%i==0) {
				isprime = false;
			}
		}
		if(isprime==true) {
			System.out.println("it is prime number");
		}
		else {
			System.out.println("it is not a prime number");
		}
	}

}
