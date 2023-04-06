package com.onesoft.day14;

import java.util.HashMap;
import java.util.Iterator;

public class Lms00 {
	public static void main(String[] args) {
		PersonalDetails p0 = new PersonalDetails("prathap",29,123456789,"male");
		PersonalDetails p1 = new PersonalDetails("singh",30,243456789,"male");
		PersonalDetails p2 = new PersonalDetails("prakash",28,123456987,"male");
		PersonalDetails p3 = new PersonalDetails("abi",28,123546789,"female");
		PersonalDetails p4 = new PersonalDetails("selvi",26,321456789,"female");
		PersonalDetails p5 = new PersonalDetails("praveen",26,123654789,"male");
		PersonalDetails p6 = new PersonalDetails("karthick",25,1023458799,"male");
		HashMap<Long,PersonalDetails> pd = new HashMap<>();
		pd.put(p0.getAadhar(), p0);
		pd.put(p1.getAadhar(), p1);
		pd.put(p2.getAadhar(), p2);
		pd.put(p3.getAadhar(), p3);
		pd.put(p4.getAadhar(), p4);
		pd.put(p5.getAadhar(), p5);
		pd.put(p6.getAadhar(), p6);
		Iterator<Long> it = pd.keySet().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
