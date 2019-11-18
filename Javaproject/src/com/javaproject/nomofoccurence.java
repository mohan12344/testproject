package com.javaproject;

import static org.testng.Assert.assertEquals;

public class nomofoccurence {

	public static void main(String[] args) {
		/*String s ="pyatanaveenkumar";
		char a[] =  s.toCharArray();
		int cout=1;
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(a[i])
			}
		}*/    
		String someString = "elephant";
		char someChar = 'e';
		int count = 0;
		  
		for (int i = 0; i < someString.length(); i++) {
		    if (someString.charAt(i) == someChar) {
		        count++;
		    }
		}
		assertEquals(2, count);
		
		
		

	}

}
