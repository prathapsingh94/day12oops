package com.onesoft.day16;

public class Cmexception {
	public static void main(String[] args) {
		String a = "Prathspsingh";
		int b = Integer.parseInt(a);
		try {
			System.out.println(b);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("not valid program");
		}
	}

}
