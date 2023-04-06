package com.onesoft.day9;

public class StudentAverage {
	public int total (int tam, int eng, int mat, int sci, int sco) {
		return tam+eng+mat+sci+sco;
	}
	public void findAverage (int tam, int eng, int mat, int sci, int sco) {
		System.out.println((tam+eng+mat+sci+sco)/5);
		
	}

}
