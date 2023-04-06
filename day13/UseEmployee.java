package com.onesoft.day13;

import java.util.ArrayList;

public class UseEmployee {
	public static void main(String[] args) {
		Employee e1 = new Employee("prathap",1102,25000,"developer",true);
		Employee e2 = new Employee("karthick",1099,35000,"hod",true);
		Employee e3 = new Employee("priya",1101,30000,"decoder",false);
		Employee e4 = new Employee("shibu",1103,28000,"designer",true);
		ArrayList<Employee> emp = new ArrayList<>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		Employee max =emp.get(0);
		/*for(int i=0; i<emp.size();i++) {
			if(emp.get(i).getId()>max.getId()) {
				max=emp.get(i);
			}
		}
			System.out.println(max);


		for(int i=emp.size()-1; i>=0; i--) {
			System.out.println(emp.get(i));
		}*/

		for(Employee x: emp) {
			System.out.println(x);
		}
		/*emp.forEach(y->System.out.println(y));
		for(Employee q: emp) {
			if(q.getIsMale()) {
				//System.out.println(q);
			}
			else {
				System.out.println(q);
			}
			
		}
		emp.forEach(k-> {
			if(k.getSalary()>30000) {
				System.out.println(k);
			}
		});
		for(int i=0; i<emp.size(); i++) {
			if(emp.get(i).getRole().equals("developer")) {
				System.out.println(emp.get(i).getName());
			}
		}
		ArrayList<Employee> femaleList = new ArrayList<>();
		emp.forEach(t-> {
			if(t.getIsMale()!=true) {
				femaleList.add(t);
			}
		});
		System.out.println(femaleList);
		
		
		femaleList.forEach(e->System.out.println(e));
		
		
		ArrayList<Employee> salaryList = new ArrayList<>();
		emp.forEach(v-> {
			if(v.getSalary()>=30000) {
				salaryList.add(v);
				
			}
		});
		System.out.println(salaryList);*/
	}
}

