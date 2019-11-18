package com.javaproject;

public class Example {

	int i=10;
	int j=1000;
		
		void m1() {
			int i=20;
			int j=20;
			int k=this.i+this.j;
			System.out.println(k);
			System.out.println(i+j);
		}
		static 
		{
			System.out.println("static block is invoked");
		}
	public static void main(String[] args) {
		Example ee=new Example();
		ee.m1();
	}
}


