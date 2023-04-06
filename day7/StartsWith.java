package com.onesoft.day7;

public class StartsWith {
	public static void main(String[] args) {
		String[] names = {"kumar","ram","ravi","raghul","raj"};
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i].startsWith("r"));
		}
	}

}
