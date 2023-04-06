package com.onesoft.day5;

public class Sum7mark {
	public static void main(String[] args) {
		int mark =60;
		if(mark<35) {
			System.out.println(mark+"is Fail");
		}
		else if(mark>=35 && mark<60) {
			System.out.println(mark+"is C grade");
		}
		else  if (mark>=60 && mark<80 ) {
			System.out.println(mark+"is B grade");
		}
		else 
			System.out.println(mark+"is A grade");
	
		}
	}


