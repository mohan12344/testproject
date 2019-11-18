package com.javaproject;

import java.util.HashSet;
import java.util.Set;

public class Dupulicate 
    {
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
    String s1="aaabbbccddeuuuuuueffgg";
    Set<Character> set=new HashSet<Character>();
    for(int i=0;i<s1.length();i++) 
    {
    	set.add(s1.charAt(i));
    	i++;
    }
    for(Character ch: set)	
    {
    	System.out.println(ch);
    }
    }
	}


