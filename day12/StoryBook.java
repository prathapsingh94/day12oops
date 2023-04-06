package com.onesoft.day12;

public class StoryBook implements Book {
	public String name(String name) {
		return name;
	}
	public int price(int price) {
		return price;
	}
	public int pages(int pages) {
		return pages;
	}
	public String author(String author) {
		if(author.equals("Travel")) {
			return "travelStories";
		}
		else {
			return "vactionStories";
		}
	}

}
