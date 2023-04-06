package com.onesoft.day12;

public abstract class Bank {
	public abstract void accNum(long num);
	public abstract void atmPin(int pin);
	public void name(String name) {
		System.out.println(name);
	}
	public void isPublic(boolean isPublic) {
		System.out.println(isPublic);
	}
	

}
