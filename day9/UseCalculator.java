package com.onesoft.day9;

public class UseCalculator {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println(c.add(10, 15, 20));
		System.out.println(c.sub());
		c.multi(25, 5);
		c.div();
	}

}
