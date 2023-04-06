package com.onesoft.day7;

public class PrintMaxString {
	public static void main(String[] args) {
		String[] names ={"prathap","singh","raghul","karthick","vignesh"};
		int max =names.length;
		String tem="";
		for(int i=0; i<names.length; i++) {
			if(names[i].length()>=max) {
				max=names[i].length();
				tem=names[i];
				
			}
		}
		System.out.println(tem);
	}


}
