package com.javaproject;

import java.util.Scanner;

public class Addnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int x,y,z;
   System.out.println("enter two integers to calculate their sum");
   Scanner scan=new Scanner(System.in);
   x=scan.nextInt();
   y=scan.nextInt();
   z=x+y;
   System.out.println("sum of entered integers=" + z);
	}

}
