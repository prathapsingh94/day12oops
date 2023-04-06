package com.onesoft.day12;

public class UseProgrammer {
	public static void main(String[] args) {
		Programmer p = new Programmer();
		p.name="Prathap";
		p.id=1102;
		System.out.println(p.name+" "+ p.id);
		p.getWork("developer");
		p.calculateSalary(8, 300);
	}

}
