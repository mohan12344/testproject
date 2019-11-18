package com.javaproject;

public class deleteaccarences {

	public static void main(String[] args) {
	  String s="pyatanaveenkumar";
	         char a[]= s.toCharArray();
	        int size= s.length();
	        char key='e';
	        int i=0;
	        String s1="";
	        while(i!=size)
	        {
	        	if(a[i]!=key)
	        	{
	        		s1=s1+a[i];
	        
	        	}
	        	i++;
	        	
	      
	        }
	      	System.out.println(s1);
	        	
	}

}
