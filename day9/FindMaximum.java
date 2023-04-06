package com.onesoft.day9;

public class FindMaximum {
	public int findMax() {
		int a = 50;
		int b = 45;
		int c = 30;
		if(a>b && a>c) {
			return a;
		}
		else if(b>a && b>c) {
			return b;
		}
		else {
			return c;
		}
	}

}
