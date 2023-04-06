package com.onesoft.day4;

public class UesMirror {
	public static void main(String[] args) {
		String[] a = args[0].split(",");
		Mirror mirror = new Mirror();
		mirror.color = a[0];
		mirror.materialType = a[1];
		mirror.weight = Float.parseFloat(a[2]);
		mirror.Shape = a[3];
		int ans = a.length;
		int length = (mirror.color.length()+mirror.materialType.length()+mirror.Shape.length());
		System.out.println(length+","+ans);
		
	}

}
class Mirror {
	String color;
	String materialType;
	float weight;
	String Shape;
	
}