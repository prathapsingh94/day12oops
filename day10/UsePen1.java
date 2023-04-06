package com.onesoft.day10;

public class UsePen1 {
	public static void main(String[] args) {
		Refill1 r = new Refill1("sd25",55,"red");
		Pen1 p = new Pen1("hero",75,r);
	//	System.out.println(r.brand);
		
		
		if(p.brand.startsWith("h")) {
			System.out.println(p.refill1.brand);
		}
		
		
	}

}
