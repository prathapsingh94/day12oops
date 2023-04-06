package com.onesoft.day6;

public class ForwardPrinting1 {
	public static void main(String[] args) {
		for (int i=1000; i<=1500; i++) {
			if(i==1200) {
				break;
			}
			System.out.println(i);
		}
	}

}
