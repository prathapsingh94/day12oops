package com.onesoft.day4;

public class Separatedprogram {
	public static void main(String[]args) {
		String[] a = args[0].split(",");
		int n1 = Integer.parseInt(a[0]);
		int n2 = Integer.parseInt(a[1]);
		String[] b = args[1].split(",");
		int n3 = Integer.parseInt(b[0]);
		int n4 = Integer.parseInt(b[1]);
		System.out.println((n1+n2)*(n3+n4));
		
	}

}
