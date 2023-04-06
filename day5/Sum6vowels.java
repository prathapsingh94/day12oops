package com.onesoft.day5;

public class Sum6vowels {
	public static void main(String[] args) {
		String a = "prathap";
		if(a.contains("a")|| a.contains("e") || a.contains("i")|| a.contains("o")|| a.contains("u")) {
			System.out.println(a+" contains vowels");
		}
		else {
			System.out.println(a+" does not contais vowels");
		}
		}
}