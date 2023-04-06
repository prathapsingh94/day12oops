package com.onesoft.day16;

public class Dmexception {
	public static void main(String[] args) {
		String[] a = {"prathap","singh","karthick","vignesh"};
		try {
			System.out.println(a[3]);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("not a valid program");
		}
	}

}
