package com.onesoft.day4;

public class PersonDetail {
	public static void main(String[]args) {
		String name =args[0];
		int id = Integer.parseInt(args[1]);
		char initial = args[2].charAt(0);
		boolean isPresent = Boolean.parseBoolean(args[3]);
		System.out.println("Name="+name+" "+"Initial="+initial);
	}

}
