package com.onesoft.day17;

public class Mobile implements Electronics {
	public int resaleAmt(int price) {
		return price/2;
	}
	public String onOff(boolean isOn) {
		if(isOn!=true) {
			return "working";
		}
		else {
			return "display gone";
		}
	}

}
