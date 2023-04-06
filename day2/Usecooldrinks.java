package com.onesoft.day2;

public class Usecooldrinks {
	public static void main(String[]args) {
		Cooldrinks d = new Cooldrinks ();
		d.brand ="cocacola";
		d.price=35;
		d.quantity =250;
		//System.out.println("Brand="+d.brand+" "+"\nPrice="+d.price+" "+"\nMl="+d.quantity);
		
		//System.out.println(" ");
		
		Cooldrinks d2 = new Cooldrinks ();
		d2.brand ="Mountaindew";
		d2.price=45;
		d2.quantity =250;
		//System.out.println("Brand="+d2.brand+" "+"\nPrice="+d2.price+" "+"\nMl="+d2.quantity);
		
		//System.out.println(" ");
		
		Cooldrinks d3 = new Cooldrinks ();
		d3.brand ="Sprite";
		d3.price=30;
		d3.quantity =250;
		//System.out.println("Brand="+d3.brand+" "+"\nPrice="+d3.price+" "+"\nMl="+d3.quantity);
		System.out.println(d+"\n"+d2+"\n"+d3);
	}

}
