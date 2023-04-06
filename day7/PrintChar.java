package com.onesoft.day7;

public class PrintChar {
	public static void main(String[] args) {
		char [] letters = {'a','b','c','d','e'};
		int count =0;
		for(int i=0; i<letters.length; i++) {
			if(letters[i]=='a' ||letters[i]=='e' ||letters[i]=='i'||letters[i]=='o' ||letters[i]=='u') {
			count++;
			System.out.println(letters[i]);
			}
		}
		System.out.println("count = "+count);
	}

}
