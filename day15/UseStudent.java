package com.onesoft.day15;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseStudent {
	public static void main(String[] args) {
		Student s1 = new Student("karthick",1099,'a',85,true,"0 positive");
		Student s2 = new Student("vignesh",1101,'b',95,true,"b positive");
		Student s3 = new Student("prathap",1102,'c',70,true,"O positive");
		Student s4 = new Student("shibu",1103,'a',80,true,"b positive");
		
		ArrayList<Student> std = new ArrayList<>();
		std.add(s1);
		std.add(s2);
		std.add(s3);
		std.add(s4);
		
		//std.stream().forEach(x->System.out.println(x));
		/*List<Student>a =std.stream().collect(Collectors.toList());
		std.stream().filter(z->z.getBloodgroup().equals("b positive")).collect(Collectors.toList());
		std.stream().filter(z->z.getBloodgroup().equals("b positive")).forEach(y->System.out.println(y));
		a.forEach(q->System.out.println(q));
		List<Student>b=std.stream().filter(f->f.getBloodgroup().equals("b positive")).collect(Collectors.toList());
		
		
		
		std.stream().map(t->t.isPresent()).forEach(i->System.out.println(i));
		
		List<Boolean>v =std.stream().map(n->n.isPresent()).collect(Collectors.toList());
		v.forEach(s->System.out.println(s));*/
		
		std.stream().filter(h->h.getRollNum()>1100).map(e->e.getName()).forEach(w->System.out.println(w));
		List<String>n=std.stream().filter(h->h.getRollNum()>1100).map(e->e.getName()).collect(Collectors.toList());
		n.forEach(k->System.out.println(k));
		
		/*std.stream().map(j->j.getAvg()).filter(r->r>=80).forEach(f->System.out.println(f));
		List<Integer>g=std.stream().map(j->j.getAvg()).filter(r->r>=80).collect(Collectors.toList());
		g.forEach(c->System.out.println(c));*/
		
		long a = n.stream().count();
		System.out.println(a);
		
		long q = std.stream().filter(x->x.getName().startsWith("k")).count();
		System.out.println(q);
		
	}

}
