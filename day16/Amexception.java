package com.onesoft.day16;

public class Amexception {
	public static void main(String[] args) {
		try {
			int a =10;
			int b = 0;
			int divi = a/b;
			System.out.println(divi);
		} catch(Exception e) {
			//System.out.println(e);
			e.printStackTrace();
		} finally {
			System.out.println("Not valid program");
		}
	}

}
