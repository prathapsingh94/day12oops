package com.onesoft.day3;

public class Booleanfunctionprogram {
	public static void main(String[]args) {
		String word ="Prathap singh";
		boolean r1 =word.contains("ap");
		boolean r2 =word.startsWith("Pra");
		boolean r3 =word.endsWith("ing");
		boolean r4 =word.equals("singh");
		boolean r5 =word.equalsIgnoreCase("pRaThap singh");
		System.out.println(r1+" "+r2+" "+r3+" "+r4+" "+r5);
				
		
	}

}
