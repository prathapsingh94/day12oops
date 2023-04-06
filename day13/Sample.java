package com.onesoft.day13;

import java.util.ArrayList;

public class Sample {
	public static void main(String[] args) {
		ArrayList<Integer> lmsid = new ArrayList<>();
		lmsid.add(570);
		lmsid.add(1099);
		lmsid.add(1102);
		lmsid.add(1101);
		int max = lmsid.get(0);
		for(int i=0; i<lmsid.size(); i++) {
			if(lmsid.get(i)>max) {
				max=lmsid.get(i);
			}
			System.out.println(lmsid.get(i));
		}
		System.out.println(max);
		for(Integer x: lmsid) {
			if(x%2==0) {
				System.out.println("even");
			}
			else {
				System.out.println("odd");
			}
			System.out.println(x);
		}
		lmsid.forEach(z-> System.out.println(z));
		lmsid.forEach(z->{System.out.println(z);});
	}

}
