package com.onesoft.day6;

public class PrintPaliyandrom {
	public static void main(String[] args) {
		String a = "Mom";
		String temb = "";
		for(int i=a.length()-1; i>=0; i--) {
			temb = temb+a.charAt(i);
		}
		if(a.equalsIgnoreCase(temb)) {
			System.out.println("Paliyandrom");
		}
		else {
			System.out.println("Not Paliyandrom");
		}
		}
	}