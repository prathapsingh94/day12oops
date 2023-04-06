package com.onesoft.day15;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class UseLaptop {
	public static void main(String[] args) {
		Laptop l1 = new Laptop("lenova",20000,"abcd",false,"black");
		Laptop l2 = new Laptop("dell",25000,"bcd",true,"silver");
		Laptop l3 = new Laptop("hp",30000,"cd",true,"white");
		Laptop l4 = new Laptop("dell",35000,"d",true,"black");
		Laptop l5 = new Laptop("samsung",38000,"abcd",false,"white");
		Laptop l6 = new Laptop("apple",60000,"abcde",true,"silver");
		
		ArrayList<Laptop> lap = new ArrayList<>();
		lap.add(l1);
		lap.add(l2);
		lap.add(l3);
		lap.add(l4);
		lap.add(l5);
		lap.add(l6);
		
		/*List<Laptop> a =lap.stream().filter(b->b.getColor().equals("black") && b.isTouch()==true).collect(Collectors.toList());
		a.forEach(x->System.out.println(x));
		
		List<String> b =lap.stream().map(y->y.getProcessor()).collect(Collectors.toList());
		b.forEach(q->System.out.println(q));
		
		long w = a.stream().count();
		System.out.println(w);
		
		
		List<Integer> r= lap.stream().filter(y->y.isTouch()==false).map(u->u.getPrice()).collect(Collectors.toList());
		r.forEach(f->System.out.println(f));
		
		List<String> u = lap.stream().map(p->p.getBrand()).filter(j->j.equals("apple")).collect(Collectors.toList());
		u.forEach(k->System.out.println(k));*/
		
		//Map<String,Laptop> laps = lap.stream().collect(Collectors.toMap(s->s.getBrand(), e->e));
		//laps.forEach((t,v)->System.out.println(t+" "+v));
		
		//Set<String>lapss =lap.stream().map(vv->vv.getBrand()).collect(Collectors.toSet());
		
		List<String>lapss =lap.stream().map(vv->vv.getBrand()).distinct().collect(Collectors.toList());
		lapss.forEach(m->System.out.println(m));
		
		
		List<Integer>la =lap.stream().map(vv->vv.getPrice()).sorted().collect(Collectors.toList());
		la.forEach(m->System.out.println(m));
		
		List<String>ss =lap.stream().map(vv->vv.getBrand()).limit(2).collect(Collectors.toList());
		ss.forEach(m->System.out.println(m));
	}

}
