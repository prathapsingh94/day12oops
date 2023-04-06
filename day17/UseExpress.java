package com.onesoft.day17;

public class UseExpress {
	public static void main(String[] args) {
		Express e = new Express();
		System.out.println(e.engine());
		System.out.println(e.isSuperfast(true));
		System.out.println(e.speed(100));
	}

}
