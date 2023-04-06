package com.onesoft.day3;

public class Test4 {
	public static void main(String[]args) {
		String w = "chennai/india";
		String[]sp =w.split("/");
		String r1 =sp[0].toUpperCase();
		String r2 =sp[1].toLowerCase();
		int r3 =sp.length;
		char r4 =r2.charAt(0);
		System.out.println(r1+"\n "+r2+"\n "+r3+"\n "+r4);
			
	}

}
