package com.onesoft.day7;

public class PrintAudi {
	public static void main(String[] args) {
		String[] names = {"BMW","Maruthi","Audi","hyundai","honda"};
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i].equalsIgnoreCase("Audi"));
		}
	}

}

