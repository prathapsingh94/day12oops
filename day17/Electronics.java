package com.onesoft.day17;

public interface Electronics {
	public int resaleAmt(int price);
	public default String onoff(boolean isOn) {
		if(isOn==true) {
			return "product is working";
		}
		else {
			return "product is not working";
		}
	}

}
