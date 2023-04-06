package com.onesoft.day8;

public class UseAc {
	public static void main(String[] args) {
		Ac ac1 = new Ac();
		ac1.brand = "Samsung";
		ac1.price = 450000;
		ac1.star = 2;
		ac1.ton = 3;

		Ac ac2 = new Ac();
		ac2.brand = "voltas";
		ac2.price = 650000;
		ac2.star = 3;
		ac2.ton = 2;

		Ac ac3 = new Ac();
		ac3.brand = "tata";
		ac3.price = 450000;
		ac3.star = 4;
		ac3.ton = 3;

		Ac ac4 = new Ac();
		ac4.brand = "sony";
		ac4.price = 550000;
		ac4.star = 2;
		ac4.ton = 2;

		Ac ac5 = new Ac();
		ac5.brand = "Samsung";
		ac5.price = 750000;
		ac5.star = 3;
		ac5.ton = 2;

		Ac[] acs = { ac1, ac2, ac3, ac4, ac5 };
		
		Ac temb = acs[0];
		for (int i = 0; i < acs.length; i++) {
			if (acs[i].brand.equals("voltas")) {
				//temb = acs[i];
				acs[i].price = acs[i].price-500;
				System.out.println(acs[i].price);
			}
		}
		
		for (int i = 0; i < acs.length; i++) {
			if (acs[i].star == 3) {
				temb = acs[i];
				System.out.println(acs[i].brand);
			}
		}
	
		
		int total = 0;
		for (int i = 0; i < acs.length; i++) {
			if (acs[i].ton == 2) {
				total = total + acs[i].price;
			}
		}
		
		int count = 0;
		System.out.println(total);
		for (Ac a: acs) {
			if (a.price > 50000) {
				count++;
			}
		}
		System.out.println("Price above 50000 is " + count);
	}

}
