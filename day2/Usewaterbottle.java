package com.onesoft.day2;

public class Usewaterbottle {
	public static void main(String[]agrs) {
		Waterbottle w = new Waterbottle ();
		w.colour = "red";
		w.litre = 2;
		w.isplastic = true;
		w.price = 200;
		w.brand = "tupperware";
		System.out.println(w.colour+" "+w.litre+" "+w.isplastic+" "+w.price+" "+w.brand);
	}

}
