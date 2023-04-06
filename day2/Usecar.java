package com.onesoft.day2;

public class Usecar {
	public static void main(String[]args) {
		Car c = new Car ();
		c.brand ="Audi";
		c.price =2000000;
		c.colour = "Black";
		c.ispetrol = true;
		c.varient = "top";
		System.out.println("Brant="+c.brand+" "+"\nPrice="+c.price+" "+"\nColour="+c.colour+"\nPetrol="+c.varient);
		
	System.out.println(" ");
		
		Car c2 = new Car ();
		c2.brand ="BMW";
		c2.price =3000000;
		c2.colour = "white";
		c2.ispetrol = true;
		c2.varient = "top";
		System.out.println("Brant="+c2.brand+" "+"\nPrice="+c2.price+" "+"\nColour="+c2.colour+"\nPetrol="+c2.varient);
	}

}
