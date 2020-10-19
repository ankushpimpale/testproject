package com.test;

import java.util.Comparator;

public class Employee {//implements Comparator<Employee>{//Comparable<Employee>{
	
	Integer eid;
	String ename;
	double esal;

	public Employee(Integer eid, String ename, double esal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getEsal() {
		return esal;
	}

	public void setEsal(float esal) {
		this.esal = esal;
	}

	/*
	 * @Override public int compare(Employee o1, Employee o2) { int flag=0;
	 * 
	 * //if()
	 * 
	 * return flag; }
	 */

	//@Override
	/*
	  public int compareTo(Employee emp) { return emp.getEid()-eid; }
	 
	
	@Override
	public int compareTo(Employee emp) {
		return ename.compareTo(emp.getEname());
	}
	*/
/*
	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.ename.compareTo(o2.getClass().getName());
	}*/
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + "]";
	}



}
