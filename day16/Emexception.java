package com.onesoft.day16;

public class Emexception {
	public static void main(String[] args) {
		String a ="Prathap";
		try {
			System.out.println(a.charAt(9));
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("not a valid program");
		}
	}

}
