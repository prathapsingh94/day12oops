package com.onesoft.day16;

public class Login {
	String password;
	public void chcekMethod(String password)throws PasswordException, Exception {
		if(password.length()>=8) {
			System.out.println("login successfully");
		}
		else {
			throw new PasswordException("must contain more than 8 characters");
		}
	}

}
