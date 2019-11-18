package com.javaproject;

public class JavaNestedifExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating two variables age and weight 
    int age=25;
    int weight=48;
   // applying the condition age and weight
    if(age<=18) {
    if(weight>50) {
    	System.out.println("You are eligible to donate blood");
    }
    else {
    	System.out.println("You are not eligible to donate blood");
    }
    }
    else 
    {
    	System.out.println("Age must be greater than 18");
    }
    }
    
	}


