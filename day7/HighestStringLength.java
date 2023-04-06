package com.onesoft.day7;

public class HighestStringLength {
	public static void main(String[] args) {
		String[] names ={"prathap","singh","raghul","karthick","vignesh"};
		int max =names.length;
		for(int i=0; i<names.length; i++) {
			if(names[i].length()>=max) {
				max=names[i].length();
				
			}
		}
		System.out.println(max);
	}

}
