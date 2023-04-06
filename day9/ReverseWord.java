package com.onesoft.day9;

public class ReverseWord {
	public String reverseWord (String name) {
		String temb ="";
		for(int i=name.length()-1; i>=0; i--) {
			temb=temb+name.charAt(i);
			}
		return temb;
	}

}
