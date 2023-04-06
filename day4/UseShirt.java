package com.onesoft.day4;

public class UseShirt {
	public static void main(String[]args) {
		Shirt s1 = new Shirt ();
		String[] sp = args[0].split(",");
		s1.brand = sp[0];
		s1.price = Integer.parseInt(sp[1]);
		s1.size = sp[2].charAt(0);
		s1.isChecked =Boolean.parseBoolean(sp[3]);
		s1.discountpercentage = Integer.parseInt(sp[4]);
		s1.netprice =s1.price-(s1.price*s1.discountpercentage)/100;
		System.out.println("Brand="+s1.brand+" "+"size="+s1.size+" "+"netprice="+s1.netprice);
	}

}
class Shirt {
	String brand;
	int price;
	char size;
	boolean isChecked;
	int discountpercentage;
	int netprice;
}