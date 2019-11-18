package com.javaproject;
class Student
{
	int rollno;          // instance variable
	String name;
	static String college="ITS"; // static variable
	static void change()  // static method to change the value of static variable
	{
	college="BBDIT";	
	}
	Student(int r,String n) // constructor to initialize the variable
	{
	rollno=r;
	name=n;
	}
	void display()  // method to display values
	{
	System.out.println(rollno+ ""+name+"" +college);	
	}
	
}
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Student s1=new Student(111, "karan");
    Student s2=new Student(111, "raghu");
    Student s3=new Student(111, "hsrm");
    s1.display();
    s2.display();
    s3.display();
    Student.change();
    
	}

}
