package com.javaproject;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  List<String> al=new ArrayList<String>();
  al.add("SeleniumIDE");
  al.add("SeleniumRC");
  al.add("SeleniumWebDriver");
  al.add("SeleniumGrid");
  System.out.println(al);
  al.set(0, "Automation");
  System.out.println(al);
  al.add("Testng");
  System.out.println(al);
  al.remove(1);
  System.out.println(al);
  
	}

}
