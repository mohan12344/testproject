package com.javaproject;
class Employee
{
	float salary=50000;
}
public class Programmer extends Employee {
  int bonous=10000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Programmer p=new Programmer();
 System.out.println("programmer salary is"+ p.salary);
 System.out.println("bonous salary is"+p.bonous);
 
	}

}
