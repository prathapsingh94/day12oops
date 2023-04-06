package com.onesoft.day12;

public class UseTeacher extends Teacher {
	public static void main(String[] args) {
		Teacher t = new Teacher();
		System.out.println(t.name("Prathap"));
		System.out.println(t.id(1102));
		System.out.println(t.isMale(false));
	}

}
