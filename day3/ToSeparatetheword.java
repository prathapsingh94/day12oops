package com.onesoft.day3;

public class ToSeparatetheword {
	public static void main(String[]args) {
		String name = "prathap,singh";
		String[]sp=name.split(",");
		System.out.println(sp[0]);
		System.out.println(sp[1]);
		System.out.println(sp.length);
	}

}
