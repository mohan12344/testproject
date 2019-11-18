package com.javaproject;

import java.util.HashSet;
import java.util.Set;

public class DupulicateString {

	public static void main(String[] args) {

  String s[]= {"mohan","manoj","raghu","mohan","raghu","manoj"};
  Set<String> set=new HashSet<String>();
  for(String st:s) 
  {
	 if(set.add(st)==false) 
	 {
		 System.out.println(st);
	 }
  }
	}

}
