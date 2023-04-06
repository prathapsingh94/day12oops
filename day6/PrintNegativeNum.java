package com.onesoft.day6;

public class PrintNegativeNum {
	public static void main(String[] args) {
		int pCount = 0;
		int nCount =0;
		int neCount =0;
		for (int i=-25; i<=25; i++) {
			if(i<0) {
				nCount++;
				System.out.println(nCount);
			}
			else if(i>0) {
				pCount++;
				System.out.println(pCount);
			}
			else {
				neCount++;
				System.out.println(neCount);
			}
			
		}
		
	}

}



