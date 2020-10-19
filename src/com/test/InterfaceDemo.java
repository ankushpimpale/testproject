package com.test;

public class InterfaceDemo implements I1,I2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceDemo i=new InterfaceDemo();
		i.m1();
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("in m1111......");
	}

}
