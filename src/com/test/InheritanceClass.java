package com.test;

class P{
	int i;
	
	P(){
		
	}
P(int s){
	System.out.println("in P..."+s);
	}	
	public static void m1(){
		System.out.println("m1-P");
	}
	public void m2() {
		System.out.println("m1-P");
	}

	
	  public static void m4() { System.out.println("m4-P"); }
	 
	protected void m6(){
		System.out.println("m6-P");
		
	}
}

class C extends P{
	
	public C() {
		
	}
	
	public C(int a) {
		super(10);
		System.out.println("in cccc..");
		DemoInterface im = (i) -> {System.out.println(i*i);}; 
		im.show(2);
	}
	public static void m4(){
		System.out.println("m4-C");
	}
	public void m6() {
		System.out.println("m4-C");
	}
}



public class InheritanceClass {
	
	public static void main(String[] args) {
		
		//int i=11;
		//InheritanceClass obj = new InheritanceClass();
		//System.out.println("eee:"+obj.k);
		//int y=i+k;
		
//		  P p=new C(10); 
		 // p.i=10; 
		  P pp=new P();
		  C c=new C(); 
		  P pc=new C();
		 c.m4();
		 pp.m4();
		 pc.m4();
		
//		C c=new C(2);
		
	}
	 


}
