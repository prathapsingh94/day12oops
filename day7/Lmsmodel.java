package com.onesoft.day7;

public class Lmsmodel {
	public static void main(String[] args) {
		int a =Integer.parseInt(args[0]);
		int b =Integer.parseInt(args[1]);
		int c =Integer.parseInt(args[2]);
		int d =Integer.parseInt(args[3]);
		int[] nums = {a,b,c,d};
		for(int i=0; i<nums.length; i++) {
			if(nums[i]%2==0) {
				System.out.println(nums[i]);
			}
		}
		
	}

}
