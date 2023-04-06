package com.onesoft.day12;

public class TngovRules extends GovRules {
	String type;
	public void colour(String type) {
		if(type.equals("Private")) {
			System.out.println("Black & White");
		}
		else if(type.equals("public")) {
			System.out.println("Black & Yellow");
		}
		else if(type.equals("electric")) {
			System.out.println("green & white");
		}
		else {
			System.out.println("invalid data");
		}
	}
	public void stateCode(String code) {
		System.out.println(code);
	}

}
