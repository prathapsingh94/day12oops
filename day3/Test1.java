package com.onesoft.day3;

public class Test1 {
	public static void main(String[]args) {
		String firstname = "ram";
		String lastname = "kumar";
		String result1 =firstname.toUpperCase();
		String result2 =lastname.toUpperCase();
		String result3 = result1.concat(result2);
		int result4= result3.length();
		System.out.println(result3+"\n"+result4);
		
	}

}
