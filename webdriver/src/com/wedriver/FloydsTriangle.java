package com.wedriver;

import java.util.Scanner;

public class FloydsTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("how many rows");
    Scanner sc=new Scanner(System.in);
    int noofrows=sc.nextInt();
    int value=1;
    System.out.println("Floyds Triangle");
    for(int i=1;i<=noofrows;i++) 
    {
    for(int j=1;j<=i;j++) 
    {
    	System.out.println(value+ "/t");
    	value++;
    }
    System.out.println("");
    }
	}

}
