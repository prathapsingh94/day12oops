package com.onesoft.day16;

public class CheckRetairementAge {
	public static void main(String[] args) throws AgeException, Exception {
		int age = 80;
		try {
			if(age<=60) {
				System.out.println("Working");
			}
			else {
				throw new AgeException("Retirement");
			}
		}catch(Exception x) {
			System.out.println(x);
			x.printStackTrace();
		}
		
	}

}
