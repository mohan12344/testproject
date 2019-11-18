package com.javaproject;

 class H {
	int i=10;
	int j=20;
	
}

	 class C extends H
	{
	void m1()
	{
		int i=20;
		int j=20;
		int k=super.i+super.j;
		System.out.println(k);
	}
	
	C(int i,int j)
	{
	int k=super.i;
	int h=super.j;
	int add=k+h;
	System.out.println(add);
	}
	}
	public class Super{
	public static void main(String[] args) {
		
	C h=new C(30,40);
	h.m1();
	
	
		

	}
	}

