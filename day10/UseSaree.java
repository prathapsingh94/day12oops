package com.onesoft.day10;

public class UseSaree {
	public static void main(String[] args) {
		Saree s1 = new Saree("Chennaisilks",3000,"red",true);
		Saree s2 = new Saree("Alaya",4500,"blue",true);
		Saree s3 = new Saree("Parampara",5000,"yellow",true);
		Saree s4 = new Saree("Samunthrika",6000,"green",true);
		Saree s5 = new Saree("Pothys",4000,"skyblue",true);
		Saree[] sarees = {s1,s2,s3,s4,s5};
		Saree temb =sarees[0];
		int max =sarees[0].getPrice();
		for(Saree x: sarees) {
			if(x.getPrice()>=max) {
				max=x.getPrice();
				temb=x;
			}
			
		}
		System.out.println(temb);
	
	}

}
