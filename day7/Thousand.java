package com.onesoft.day7;

public class Thousand {
	public static void main(String[] args) {
		int [] nums = {98,110,120,86,100};
		for(int i=0; i<nums.length; i++) {
			if(nums[i]>=100) {
				System.out.println(nums[i]+1000);
			}
		}
	}

}
