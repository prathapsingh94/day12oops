package com.onesoft.day7;

public class ReverseStringArray {
	public static void main(String[] args) {
		String [] names = new String[4];
		names[0] ="Prathap";
		names[1]="singh";
		names[2]="kumar";
		names[3]="ram";
		String tem="";
		for(int i=names.length-1; i>=0; i--) {
			System.out.println(names[i]);
			tem=tem+names[i]+",";
		}
		System.out.println(tem);
	}

}
