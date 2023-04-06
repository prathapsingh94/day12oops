package com.onesoft.day16;

public class CheckVoterAge {
	public static void main(String[] args) throws AgeException, Exception {
		int age = 10;
		try { 
			if(age>=18) {
				System.out.println("eligible to vote");
			}
			else {
				throw new AgeException("Not eligible to vote ");
			}
		}catch (Exception x) {
			System.out.println(x);
		}
		
	}
}

