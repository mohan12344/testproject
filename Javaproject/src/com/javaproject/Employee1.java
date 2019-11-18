package com.javaproject;

public class Employee1 {
     // variable 
	private String name="Mohan";
	private  String empid="2115";
	private int age=27;
	
	// method 
	public void print() 
	{
		System.out.println("hello,iam: "+ name);
		System.out.println("My emp id: " + empid);
		System.out.println("My age is: " + age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Employee1 emp=new Employee1();
    emp.print();
	}

}
