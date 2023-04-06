package com.onesoft.day7;

public class Largestvalue {
	public static void main(String[] args) {
		int[] nums = {60,20,30,77,90,98};
		int max = nums[0];
		for(int i=0; i<nums.length; i++) {
			if(nums[i]>=max) {
				max=nums[i];
			}
		}
		System.out.println("largest value "+max);
	}

}
