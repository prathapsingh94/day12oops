package com.onesoft.day14;

import java.util.HashMap;

public class Lms6 {
	public static void main(String[] args) {
		HashMap<Integer,String> lms = new HashMap<>();
		lms.put(508, "VijayaLakshmi");
		lms.put(1101, "vignesh");
		lms.put(1102, "Prathap");
		lms.put(1099, "Karthick");
		lms.forEach((x,y)->System.out.println(x+" "+y));
		}

}