package com.onesoft.day12;

public class OnlineCourse implements Course {
	public String traineName(String name) {
		return name;
	}
	public int hours(int hours) {
		return hours;
	}
	public boolean isOnline(boolean isOnline) {
		return isOnline;
	}
	public String link(String link) {
		return link;
	}
	public String fees(String courseName) {
		if(courseName.equals("Java")) {
			return "Fees is 20k";	
		}
		else if(courseName.equals("SQL")) {
			return "Fees is 15k";
		}
		else if(courseName.equals("Python")) {
			return "Fees is 18k";
		}
		else {
			return "Not Available";
		}
		
	}

}
