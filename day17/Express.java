package com.onesoft.day17;

public class Express implements Train {
	public int speed(int speed) {
		return speed/2;
	}
	public boolean isSuperfast(boolean isSuperfast) {
		return isSuperfast;
	}
	public String engine() {
		return "petrol";
	}

}
