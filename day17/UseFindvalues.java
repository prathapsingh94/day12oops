package com.onesoft.day17;

public class UseFindvalues {
	public static void main(String[] args) {
		Method m = new Method();
		Findvalues max = m:: findMax;
		int[] a = {12,15,16,18,19,35,45};
		max.findArray(a);
		Findvalues min = m::findMin;
		int[] b = {25,26,28,29,38,35};
		min.findArray(b);
	}

}
