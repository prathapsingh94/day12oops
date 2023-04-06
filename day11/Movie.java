package com.onesoft.day11;

public class Movie {
	int fight;
	public String rating(int fight) {
		if(fight==5) {
			return "very good";
		}
		else if(fight==4) {
			return "good";
		}
		else if(fight==3) {
			return"average";
		}
		else {
			return"ok";
		}
		
	}

}
