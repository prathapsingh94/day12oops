package com.onesoft.day2;

public class UseShirt {
	public static void main(String[] args){
		Shirt s = new Shirt ();
		s.brand="Peterengland";
		s.amount =2500;
		s.discountampunt =300;
		s.netPrice=(s.amount-s.discountampunt);
		System.out.println("Brand="+s.brand+" "+"\nFinalprice="+s.netPrice);
		
		System.out.println(" ");
		
		Shirt s2 = new Shirt ();
		s2.brand="Tommy";
		s2.amount =3500;
		s2.discountPercentage =15;
		s2.netPrice=s2.amount-(s2.amount*s2.discountPercentage)/100;
		System.out.println("Brand="+s2.brand+" "+"\nFinalprice="+s2.netPrice);
		
	}
	

}
