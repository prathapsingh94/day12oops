package com.onesoft.day16;

public class Bmexception {
	public static void main(String[] args) {
		String a = null;
		try {
			System.out.println(a.toLowerCase());
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("not valid program");
		}
		
	}

}
