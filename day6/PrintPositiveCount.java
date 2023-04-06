package com.onesoft.day6;

public class PrintPositiveCount {
	public static void main(String[] args) {
		int count = 0;
		for (int i=-25; i<=25; i++) {
			if(i>0) {
				count++;
				System.out.println(i);
			}
			
		}
		System.out.println("Positive count = "+count);
	}

}



