package com.onesoft.day12;

public class SmartPhone implements Phone {
	public String brand(String brand) {
		return brand;
	}
	public boolean vedioCall(boolean vedioCall) {
		return vedioCall;
	}
	public boolean voiceCall(boolean voiceCall) {
		return voiceCall;
	}
	public boolean connectivity(boolean connectivity) {
		return connectivity;
	}
	public void function(String tapping) {
		switch(tapping) {
		case "single tapping": System.out.println("TakingPicture");break;
		case "double tapping": System.out.println("Zooming");break;
		case "continues tapping": System.out.println("ContinuesShots");break;
		default: System.out.println("InvalidData");break;
		}
		
	}

}
