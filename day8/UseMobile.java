package com.onesoft.day8;

public class UseMobile {
	public static void main(String[] args) {
		Mobile m1 = new Mobile();
		m1.brand = "Samsung";
		m1.color = "black";
		m1.price = 20000;
		m1.is5g = true;
		
		Mobile m2 = new Mobile();
		m2.brand = "Nokia";
		m2.color = "gray";
		m2.price = 18000;
		m2.is5g = true;
		
		Mobile m3 = new Mobile();
		m3.brand = "redmi";
		m3.color = "White";
		m3.price = 15000;
		m3.is5g = true;
		
		Mobile m4 = new Mobile();
		m4.brand = "realme";
		m4.color = "Silver";
		m4.price = 22000;
		m4.is5g = true;
		
		Mobile m5 = new Mobile();
		m5.brand = "oneplus";
		m5.color = "purple";
		m5.price = 25000;
		m5.is5g = true;
		
		Mobile m6 = new Mobile();
		m6.brand = "apple";
		m6.color = "gold";
		m6.price = 250000;
		m6.is5g = true;
		
		Mobile m7 = new Mobile();
		m7.brand = "twoplus";
		m7.color = "green";
		m7.price = 35000;
		m7.is5g = true;
		
		Mobile m8 = new Mobile();
		m8.brand = "greenme";
		m8.color = "pink";
		m8.price = 25000;
		m8.is5g = true;
		
		Mobile m9 = new Mobile();
		m9.brand = "threeplus";
		m9.color = "orange";
		m9.price = 45000;
		m9.is5g = true;
		
		Mobile m10 = new Mobile();
		m10.brand = "fiveplus";
		m10.color = "purple";
		m10.price = 55000;
		m10.is5g = true;
		
		
		
		Mobile[] mobiles = {m1,m2,m3,m4,m5,m6,m7,m8,m9,m10};
		//for(int i=0; i<mobiles.length; i++) {
			//if(mobiles[i].price>25000) {
				//System.out.println(mobiles[i].brand);
			//}
		//}
		Mobile temb = mobiles[0];
		for(int i=0; i<mobiles.length; i++) {
				if(mobiles[i].price>temb.price) {
				temb=mobiles[i];
		}
		}
		System.out.println(temb.brand+" "+temb.price);
	}
}


