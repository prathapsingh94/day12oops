package com.onesoft.day11;

public class RomanticMovie extends Movie {
	int fight;
	public String rating(int fight) {
		if(fight==5) {
			return "ok";
		}
		else if(fight==4) {
			return "average";
		}
		else if(fight==3) {
			return"good";
		}
		else {
			return"very good";
		}
		
	}


}
