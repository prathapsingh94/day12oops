package com.onesoft.day7;

public class PrintString {
	public static void main(String[] args) {
		String[] names = {"prathap","singh","ram","kumar","dlp"};
		int count =0;
		for(int i=0; i<names.length; i++) {
			if(names[i].contains("a") ||names[i].contains("e") ||names[i].contains("i")||names[i].contains("o") ||names[i].contains("u")) {
			count++;
			System.out.println(names[i]);
			}
		}
		System.out.println("count = "+count);
	}

}
