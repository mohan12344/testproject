package com.javaproject;
interface I
{
	int i=10;
	void m1();
}

public class Test3 implements I {
	static 
	{
		System.out.println("static block is invoked");
	}
	public void m1() 
	{
		int i=20;
		System.out.println(this.i);
		System.out.println(i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("test") ;   
		
		I i=new Test3();
    i.m1();
    Test3 ts=new Test3();
    ts.m1();
	}

}
