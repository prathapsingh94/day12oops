package com.onesoft.day14;

import java.util.HashMap;

public class UsePersonalDetails1 {
	public static void main(String[] args) {
		PersonalDetails p = new PersonalDetails("prathap",29,123456789,"male");
		PersonalDetails p1 = new PersonalDetails("singh",3,243456789,"male");
		PersonalDetails p2 = new PersonalDetails("prakash",28,123456987,"male");
		PersonalDetails p3 = new PersonalDetails("abi",12,123546789,"female");
		PersonalDetails p4 = new PersonalDetails("selvi",14,321456789,"female");
		PersonalDetails p5 = new PersonalDetails("praveen",26,123654789,"male");
		PersonalDetails p6 = new PersonalDetails("karthick",25,123458799,"male");
		HashMap<Long,PersonalDetails> pd = new HashMap<>();
		pd.put(p.getAadhar(), p);
		pd.put(p1.getAadhar(), p1);
		pd.put(p2.getAadhar(), p2);
		pd.put(p3.getAadhar(), p3);
		pd.put(p4.getAadhar(), p4);
		pd.put(p5.getAadhar(), p5);
		pd.put(p6.getAadhar(), p6);
		PersonalDetails max= pd.get(p);

		for(PersonalDetails x: pd.values()) {
			if(x.getAge()>max.getAge()) {
				max=x;
				//System.out.println(x);
			}
			
			
		}
		System.out.println(max);
	}
}
