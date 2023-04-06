package com.onesoft.day12;

public class UseOnlineCourse {
	public static void main(String[] args) {
		OnlineCourse o = new OnlineCourse();
		System.out.println(o.traineName("prathap"));
		System.out.println(o.hours(4));
		System.out.println(o.isOnline(false));
		System.out.println(o.link("prathap@onesofts.in"));
		System.out.println(o.fees("Java"));
	}

}
