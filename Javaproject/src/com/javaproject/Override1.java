 package com.javaproject;

public class Override1 extends Override{
  public void add(int a,int b) 
  {
	  System.out.println(a-b);
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Override obj1=new Override1();
    obj1.add(10, 20);
    Override obj=new Override();
    obj.add(10, 20);
	}

}
