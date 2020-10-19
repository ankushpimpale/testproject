package com.test;

import java.util.Comparator;

public class MyComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		System.out.println("in compare...");
		int flag=0;
		flag=o1.eid.compareTo(o2.eid);
		if(flag==0) {
			flag=o1.ename.compareTo(o2.ename);
		}
		
		return flag;
	}

}
