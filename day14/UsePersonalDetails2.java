package com.onesoft.day14;

import java.util.HashMap;

public class UsePersonalDetails2 {
	public static void main(String[] args) {
		PersonalDetails p0 = new PersonalDetails("prathap",29,123456789,"male");
		PersonalDetails p1 = new PersonalDetails("singh",30,243458799,"male");
		PersonalDetails p2 = new PersonalDetails("prakash",28,120456987,"male");
		PersonalDetails p3 = new PersonalDetails("abi",28,123546789,"female");
		PersonalDetails p4 = new PersonalDetails("selvi",26,321456789,"female");
		PersonalDetails p5 = new PersonalDetails("praveen",26,123654789,"male");
		PersonalDetails p6 = new PersonalDetails("krthck",25,13458799,"male");
		HashMap<Long,PersonalDetails> pd = new HashMap<>();
		pd.put(p0.getAadhar(), p0);
		pd.put(p1.getAadhar(), p1);
		pd.put(p2.getAadhar(), p2);
		pd.put(p3.getAadhar(), p3);
		pd.put(p4.getAadhar(), p4);
		pd.put(p5.getAadhar(), p5);
		pd.put(p6.getAadhar(), p6);
		pd.values().forEach(x-> {
			if(x.getName().contains("a")  ||x.getName().contains("e") ||x.getName().contains("i") ||x.getName().contains("o") ||x.getName().contains("u")) {
				//System.out.println(x.getName()+" contains vowels");
			}
			else {
				System.out.println(x.getName()+" does not");
			}
		});
	}
		
}
