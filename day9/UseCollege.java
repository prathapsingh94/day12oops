package com.onesoft.day9;

public class UseCollege {
	public static void main(String[] args) {
		College c1 = new College();
		c1.name = "SNS";
		c1.fees = 40000;
		c1.location ="kovai";
		c1.grade ='A';
		
		College c2 = new College();
		c2.name = "Park";
		c2.fees = 35000;
		c2.location ="eroad";
		c2.grade ='B';
		
		College c3 = new College();
		c3.name = "RVS";
		c3.fees = 38000;
		c3.location ="sulur";
		c3.grade ='C';
		
		College [] colleges = {c1,c2,c3};
		System.out.println(c1.findmax(colleges));
		c1.findmin(colleges)
		;
	}

}
