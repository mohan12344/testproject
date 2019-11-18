package com.javaproject;

public class Cloudpragram {

	public static void main(String[] args) {
		
		for (int i =2; i <=8; i++) 
		{	
			if(i%3==0 && i%7==0) 
			{
				System.out.println("CLOUDNIX");
				continue;
			}
			
			else if(i%3==0) 
			{
				System.out.println("CLOUD");
				continue;
			}
			
			else if(i%7==0) 
			{
				System.out.println("NIX");
				continue;
			}
			
			System.out.println(i);
		}
	}

	}


