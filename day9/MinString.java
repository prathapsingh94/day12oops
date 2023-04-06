package com.onesoft.day9;

public class MinString {
	public String findmin (String[] a) {
		String min = a[0];
		for(int i=0; i<a.length; i++) {
			if(a[i].length()<min.length()) {
				min=a[i];
			}
		}
		return min;
	}

}
