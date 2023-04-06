package com.onesoft.day7;

public class PrintLastletter {
	public static void main(String[] args) {
		String[] names = {"prathap","singh","ram","kumar","dlp"};
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i].charAt(names[i].length()-1));
		}
	}
}



