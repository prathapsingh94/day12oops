package com.onesoft.day16;

public class Sample {
	public  void findA() {
		findB();
	}
	
	public void findB() {
		findA();
	
	}
	public static void main(String[] args) {
		Sample of = new Sample();
		of.findB();
	}
	}