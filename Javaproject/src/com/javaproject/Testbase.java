package com.javaproject;


class Bank
{
	int getRateofInterest() 
	{
	return 0;	
	}
}
	class SBI extends Bank 
	{
	int getRateofInterest() 
	{
		return 8;
	}	
	}
	class IcIcI extends Bank 
	{
	 int getRateofInterest() 
	 {	
		return 7;
	}
	}
	class AXIS extends Bank 
	{
		int getRateofInterest() 
		{
			return 9;
		}
	}


 public class Testbase {

	public static void main(String[] args) 
	{
		SBI s= new SBI();
		IcIcI i=new IcIcI();
		AXIS a=new AXIS();
	System.out.println("SBIRateofInterest :"+s.getRateofInterest());
	System.out.println("IcIcIRateofInterest :"+i.getRateofInterest());
	System.out.println("AXISRateofInterest :"+a.getRateofInterest());
	}
}

	


