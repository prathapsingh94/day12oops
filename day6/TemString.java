package com.onesoft.day6;

public class TemString {
	public static void main(String[] args) {
		String a ="singh";
		String tem = "";
		for ( int i=0; i<a.length(); i++) {
			tem=tem+a.charAt(i);
		}
		System.out.println(tem);		
	}
}