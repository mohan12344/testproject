package com.javaproject;

import java.util.HashSet;
import java.util.Set;

public class deletecharbyset {

	public static void main(String[] args) {
	/*String S="aabbccddaaaaaaaaaaaaaaaaaaaaaaaaaaa";
	Set<Character> set=new HashSet<Character>();
	for(int i=0;i<S.length();i++)
	{
		set.add(S.charAt(i));
		i++;
	}
	for(Character ch: set)
	{
		System.out.println(ch);
	}
	*/
		String s[]= {"java","naveen","mohan","naveen","mohan"};
		Set<String> set=new HashSet<String>();
		for(String st:s)
		{
			if(set.add(st)==true)
			{
				System.out.println(st);
			}
		}
	

	}

}
