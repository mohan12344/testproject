package com.javaproject;
class A 
{
 int i=20;
 int j=30;
}
class B extends A
{
  void m2() 
  {
	  int i=10;
	  int j=20;
	  int k=this.i+this.j;
	  System.out.println(k);
  }	
  B()
  {
	  
  }
}
