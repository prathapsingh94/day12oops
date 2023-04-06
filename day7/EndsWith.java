package com.onesoft.day7;

public class EndsWith {
	public static void main(String[] args) {
		String[] names = {"kumar","ram","ravi","raghul","raj"};
		//boolean isStartsWith=true;
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i].endsWith("l"));
		}
	}

}
