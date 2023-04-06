package com.onesoft.day7;

public class PrintNewtral {
	public static void main(String[] args) {
		int [] nums = {-6,0,-27,0,24,0,-3};
		int count =0;
		for(int i=0; i<nums.length; i++) {
			if(nums[i]==0) {
				count++;
			
			System.out.println(nums[i]);
			}
		}
		System.out.println("count"+count);
	}

}
