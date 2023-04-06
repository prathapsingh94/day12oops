package com.onesoft.day12;

public class UseSmartPhone {
	public static void main(String[] args) {
		SmartPhone s = new SmartPhone();
		System.out.println(s.brand("SamSung"));
		System.out.println(s.vedioCall(true));
		System.out.println(s.voiceCall(true));
		System.out.println(s.connectivity(true));
		s.function("single tapping");
	}

}
