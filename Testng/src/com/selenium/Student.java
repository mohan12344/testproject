package com.selenium;

public class Student {

	int id;
	String name;
	static String college="Jntua";
	
	static void change() 
	{
		college="Jntuh";
	}
	Student(int i,String n)
	{
		id=i;
		name=n;
	}
	void display() 
	{
		System.out.println(id+" "+name+" "+college);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Student s1=new Student(111,"karan");
    Student s2=new Student(222,"aryan");
    Student s3=new Student(333,"raghu");
    Student.change();
    s1.display();
    s2.display();
    s3.display();
	}

}
