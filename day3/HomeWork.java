package com.onesoft.day3;

public class HomeWork {
	public static void main(String[]args) {
		String w = "welcome-to-my-world";
		String[]sp=w.split("-");
		int l =sp.length;
		String s3=sp[0];
		char ans3=s3.charAt(s3.length()-1);
		String s4=sp[2];
		int ans4=s4.length();
		String s5=sp[3];
		String ans5=s5.substring(1,4);
		int ans6=s4.indexOf('y');
		char l2 = s3.charAt(0);
		char l3 = s5.charAt(0);
		boolean ans7 = l2==l3;
		System.out.println(sp[2].toUpperCase()+sp[3].toUpperCase()+"\n"+l+"\n"+ans3+"\n"+ans4+"\n"+ans5+"\n"+ans7+"\n"+ans6);
			
	}

}
