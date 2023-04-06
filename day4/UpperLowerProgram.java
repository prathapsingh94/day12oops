package com.onesoft.day4;

public class UpperLowerProgram {
	public static void main(String[]args) {
		String[]sp=args[0].split(",");
		String n1 = sp[0];
		String n2 = sp[1];
		String n3 = n1.toUpperCase();
		String n4 = n2.toLowerCase();
		System.out.println(n3+" "+n4);
	}

}
