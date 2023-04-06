package com.onesoft.day9;

public class MaxNum {
	public int findmax (int[] a) {
		int max = a[0];
		for(int i=0; i<a.length; i++) {
			if(a[i]>=max) {
				max=a[i];
			}
		}
		return max;
	}

}
