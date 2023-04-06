package com.onesoft.day5;

public class SwitchMonth {
	public static void main(String[] args) {
		String month = "sep";
		switch (month) {
		case "jan" : System.out.println("first month of the year");break;
		case "feb": System.out.println("second month of the year");break;
		case "march" : System.out.println("third month of the year");break;
		case "april" : System.out.println("fourth month of the year");break;
		case "may" : System.out.println("fifth month of the year");break;
		case "june" : System.out.println("sixth month of the year");break;
		case "july" : System.out.println("seventh month of the year");break;
		case "aug" : System.out.println("eighth month of the year");break;
		case "sep" : System.out.println("nineth month of the year");break;
		case "oct" : System.out.println("tength month of the year");break;
		case "nov" : System.out.println("eleventh month of the year");break;
		case "dec" : System.out.println("tweleth month of the year");break;
		default : System.out.println("invalid");break;
		}
	}

}
