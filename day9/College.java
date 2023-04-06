package com.onesoft.day9;

public class College {
	String name;
	int fees;
	String location;
	char grade;
	
	public int findmax (College[] a) {
		int max = a[0].fees;
		for(int i=0; i<a.length; i++) {
			if(a[i].fees>=max) {
				max=a[i].fees;
			}
		}
		return max;
	}
		
		public void findmin(College[] b) {
			College min =b[0];
			for(int i=0; i<b.length; i++) {
				if(b[i].fees>=min.fees) {
					min= b[i];
				}
			}
			System.out.println(min.name+" "+min.fees+" "+min.grade);
		}
		
	

}
