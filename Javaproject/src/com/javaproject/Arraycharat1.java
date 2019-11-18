package com.javaproject;

public class Arraycharat1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String str="Welcome to javatpoint portal";
    int count=0;
    for(int i=0;i<=str.length()-1;i++) 
    {
    	if(str.charAt(i)=='t') 
    	{
    		count++;
    	}
    }
    System.out.println("frequencey of its:" +count);
	}
}