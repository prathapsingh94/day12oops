package com.onesoft.day7;

public class Smallestvalue {
	public static void main(String[] args) {
		int[] nums = {60,20,30,77,90,98};
		int min = nums[0];
		for(int i=0; i<nums.length; i++) {
			if(nums[i]<min) {
				min=nums[i];
			}
		}
		System.out.println("smallest value "+min);
	}

}