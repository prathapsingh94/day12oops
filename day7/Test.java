package com.onesoft.day7;

public class Test {
	public static void main(String[] args) {
		String [] names = {"EAT","xyz","BCD","apple"};
		for(int i=0; i<names.length; i++) {
			if(names[i].contains("a") ||names[i].contains("e") ||names[i].contains("i")||names[i].contains("o") ||names[i].contains("u") ||names[i].contains("A") ||names[i].contains("E") ||names[i].contains("I") ||names[i].contains("O") ||names[i].contains("U")) {
				System.out.println(names[i]);
			}
		}
	}
}
