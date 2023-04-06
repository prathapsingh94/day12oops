package com.onesoft.day17;
public interface Train {
	public int speed(int speed);
	public static boolean isSuperfast(boolean isSuperfast) {
		return isSuperfast;
	}
	public default String engine() {
		return "diesel";
	}
	public int seat(int seat);

}
