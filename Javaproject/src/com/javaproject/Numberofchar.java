package com.javaproject;

import java.util.HashMap;
import java.util.Map;

public class Numberofchar {

	public static void main(String[] args) {
		String str = "mohanraghu";
		Map<Character,Integer> mp = new HashMap<Character,Integer>();
		 for(Character c: str.toCharArray())
		 {
			 if(mp.containsKey(c))
			 {
				 mp.put(c, mp.get(c)+1);
				 
			 }
			 else
			 {
				 mp.put(c, 1);
			 }
		 }
System.out.println(mp);
	}

}
