package com.javaproject;

import java.util.Arrays;

public class ArrayToString {

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
   // converting to int array to String in java
		int[] numbers= {1,2,3,4,5,6};
		System.out.println(numbers.toString());
		String str = Arrays.toString(numbers); 
		System.out.println("int array as String in Java : " + str); 	
	
   // converting to char array to String in java
		char[] vowels= {'a','e','w','r','j'};
		System.out.println(vowels.toString());
		String charArrayAsString = Arrays.toString(vowels); 
		System.out.println("char array as String in Java : " + str); 
		
   // converting to byte array to string in java
		byte[] bytes= {(byte) 0*12, (byte) 0*14,(byte) 0*16,(byte) 0*18};
		System.out.println(bytes.toString());
		String byteArrayAsString = Arrays.toString(bytes);
		System.out.println("byte array as String in Java : " + byteArrayAsString); 

   // converting to float array to String in java
		float[] floats= {0.01f, 0.02f, 0.03f, 0.04f};
		System.out.println(floats.toString());
		String floatString = Arrays.toString(floats); 
		System.out.println("float array as String in Java : " + floatString); 

   // converting to	double array to string in java
		double[] values = {0.5, 1.0, 1.5, 2.0, 2.5}; 
		System.out.println(values.toString()); 
		String doubleString = Arrays.toString(values); 
		System.out.println("double array as String in Java : " + doubleString); 

		// Converting object array to String in Java 
		Object[] objects = {"abc", "cdf", "deg", "england", "india"}; 
		System.out.println(objects.toString()); 
		String objectAsString = Arrays.toString(objects); 
		System.out.println("object array as String in Java : " + objectAsString); 

		
	}

}
