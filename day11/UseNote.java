package com.onesoft.day11;

public class UseNote {
	public static void main(String[] args) {
		Note n1 = new Note("spkc",50,"red",true,false);
		Note n2 = new Note("classmate",60,"blue",false,true);
		Note[] notes= {n1,n2};
		for(Note x: notes) {
			System.out.println(x);
		
		}
	}

}
