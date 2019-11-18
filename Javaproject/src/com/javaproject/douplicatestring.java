package com.javaproject;

import java.util.HashSet;
import java.util.Set;

import org.testng.annotations.Test;
 
public class douplicatestring {

	public static void main(String[] args)
	{
		String names[] =  {"java","ruby","java","selenium","ruby"};
		Set<String> st =new HashSet<String>();
		for(String s : names )
		{
			if (st.add(s)== true)
			{
				System.out.println(s);
			}
		}
		

	}

}
