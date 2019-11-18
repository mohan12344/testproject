package com.javaproject;

public class Hs {

	
		public static void main(String[] args) { 
			String str = "I AM AN INDIAN"; 
			String [] strArr = str.split(" "); 

			String reverse=""; 

			for(String temp: strArr){ 
			reverse = temp+" "+reverse; 
			} 
			System.out.println(reverse); 
			} 

	}


