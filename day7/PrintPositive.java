package com.onesoft.day7;

public class PrintPositive {
	public static void main(String[] args) {
		int [] nums = {-25,25,36,-60,-70,40};
		int count =0;
		for(int i=0; i<nums.length; i++) {
			if(nums[i]>0) {
				System.out.println(nums[i]);
				count++;
			}
			
		}
		System.out.println("count "+count);
	}

}
