package com.onesoft.day11;

public class MaxValue {
	public void findmax(int a) {
		if(a>10) {
			System.out.println(a+"is greater");
		}
		else {
			System.out.println(a+"is smaller");
		}
	}
	public void findmax(int a,int b) {
		if(a>b) {
			System.out.println(a+"is greater");
		}
		else {
			System.out.println(a+"is smaller");
		}
	}
	public void findmax(int a,int b, int c) {
		if(a>b && a>c) {
			System.out.println(a+"is greater");
		}
		else {
			System.out.println(a+"is smaller");
		}
	}
	public void findmax(String[] a) {
		int max=a[0].length();
		String temb="";
		for(int i=0; i<a.length; i++) {
			if(a[i].length()>max) {
				max=a[i].length();
				temb=a[i];
			}
	}
		System.out.println(temb);
	}
}
