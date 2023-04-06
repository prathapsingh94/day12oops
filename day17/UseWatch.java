package com.onesoft.day17;

public class UseWatch {
	public static void main(String[] args) {
		int a = 1500;
		Watch titan = (price)->{
			if(price>1000) {
				return "smart watch";
			}
			else {
				return "normal watch";
			}
		};
		System.out.println(titan.findWatch(a));
	}

}
