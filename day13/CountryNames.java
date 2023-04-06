package com.onesoft.day13;

import java.util.ArrayList;

public class CountryNames {
	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<>();
		name.add("jpn");
		name.add("china");
		name.add("nepal");
		name.add("iran");
		name.add("italy");
		name.add("india");
		//for(String x: name) {
			//if(x.contains("a") ||x.contains("e") ||x.contains("i")||x.contains("o")||x.contains("u")) {
				//System.out.println("contains vow");
			//}
			//else {
				//System.out.println("does not");
			//}
		//}
		/*for(int i=0; i<name.size(); i++) {
			if(!name.get(i).endsWith("a")) {
				System.out.println(name.get(i)+" not");
			}
			else {
				System.out.println(name.get(i)+" ends with a");
			}
		}*/
		String min =name.get(0); 
		for(String y: name) {
			if(y.length()<min.length()) {
				min=y;
			}
		}
		System.out.println(min);
		for(int i=0; i<name.size(); i++) {
			System.out.println(name.get(i).charAt(name.get(i).length()-1));
			
		}
	}
}
