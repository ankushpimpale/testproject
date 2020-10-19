package com.test;

import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		/*		
		Scanner scn= new Scanner(System.in);
		System.out.println("enter via Scanner: ");		
		String s=scn.nextLine();
		System.out.println("scanner s: "+s);
		
		Console console=System.console();
		System.out.println("enter via console: ");		
		String str2=console.readLine();
		System.out.println("console str2: "+str2);
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter via BufferedReader: ");		
		String str3=br.readLine();
		System.out.println("BufferedReader str3: "+str3);
		
		System.out.println("enter via command line argument: ");		
		String str4=args[0];
		System.out.println("Command line arguments str4: "+str4);
		
		System.out.println("enter via command line argument: ");		
		String str5=args[0];
		System.out.println("Command line arguments str5: "+str5);
		*/
		/*
		//prog to make first letter capital in string.
		StringBuilder str=new StringBuilder("geegs for geegs asdf adgna akndfina");
		int flag=0;
			System.out.println("str: "+str);
		for(int i=0;i<str.length();i++) {
				if(flag==1||i==0) {
					str.setCharAt(i,Character.toUpperCase(str.charAt(i)));
//					res=str.substring(0,i).append(Character.toUpperCase(str.charAt(i))).append(str.substring(i+1));
					flag=0;
				}
				if(str.charAt(i)==' ') {
					flag=1;	
				}			
		}
		System.out.println("new str: "+str);
		*/
		
		
		//prog to remove white spaces from string.
		String inputStr="geegs for geegs asdf adgna akndfina";
		char[] charr=new char[inputStr.length()];
		char tmp;
		int k=0;
		for(int i=0;i<inputStr.length();i++) {
			tmp=inputStr.charAt(i);
			if(tmp!=' ') {
				charr[k]=inputStr.charAt(i);
				k++;
			}
			
		}
		System.out.println("inputStr: "+inputStr);
		System.out.println("charecter set: "+ new String(charr));
		
		
		
	}

}
