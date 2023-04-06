package com.onesoft.day3;

public class ToSeparatecharecters {
	public static void main(String[]args) {
		String word = "Singh";
		char[]letters=word.toCharArray();
		char ans1 = letters[0];
		int ans2 = letters.length;
		System.out.println(ans2);
		System.out.println(ans1);
		System.out.println(letters[2]);
		System.out.println(letters[3]);
		System.out.println(letters[4]);
	}

}
