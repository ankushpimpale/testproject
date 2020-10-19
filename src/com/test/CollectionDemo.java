package com.test;

import java.util.Enumeration;
import java.util.Vector;
import java.util.*;
public class CollectionDemo {
	public static void main(String []args) {
		
		Employee emp1=new Employee(3,"xxx",40000.00);
		Employee emp2=new Employee(5,"Suhas",20000.00);
		Employee emp3=new Employee(6,"Vivek",60000.00);
		Employee emp4=new Employee(1,"Tushar",10000.00);
		Employee emp5=new Employee(1,"xxx",30000.00);
		ArrayList<Employee> al= new ArrayList<>();
	
	al.add(emp1);
	al.add(emp2);
	al.add(emp3);
	al.add(emp4);
	al.add(emp5);
	System.out.println("al: "+al);
//Comparator
	//Collections.sort(al,new MyComparator());
	al.sort(new MyComparator());
	
	/*
	al.sort(new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			return o2.ename.compareTo(o1.ename);
		}
		
	});*/
	System.out.println("------al: "+al);
	for(Employee e:al){
		System.out.println("Employee: \n"+e.getEid()+" "+e.getEname()+" "+e.getEsal());
	}
	/*
	Vector v=new Vector(5);
	// Add data to v
	v.add("Deo");
	v.addElement("Smith");
	v.addElement("Karter");
	v.addElement("Porter");

	// Extract the data
	  Enumeration e=v.elements();  
	  while(e.hasMoreElements()){  
	  System.out.println("enumeration: "+e.nextElement());  
	  }
	  */  
	}
}
