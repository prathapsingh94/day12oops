package com.onesoft.day7;

public class Printprimenumber {
	public static void main(String[] args) {
		int[] nums = {6,2,3,7,9,5};
		int max = nums[0];
		for(int i=0; i<nums.length; i++) {
			if(nums[i]>max) {
				max=nums[i];
			}
		}
System.out.println(max);
}
}