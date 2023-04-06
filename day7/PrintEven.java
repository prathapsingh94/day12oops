package com.onesoft.day7;

public class PrintEven {
	public static void main(String[] args) {
		int [] nums = {-6,-9,-27,25,24,18,-3};
		int count =0;
		for(int i=0; i<nums.length; i++) {
			if(nums[i]%2==0) {
				count++;
			
			System.out.println(nums[i]);
			}
		}
		System.out.println("count"+count);
	}

}
