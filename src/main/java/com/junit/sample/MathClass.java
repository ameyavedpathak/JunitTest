package com.junit.sample;

public class MathClass {

	public int max(int a, int b)
	{
		if(a>b)
		{
			return a;
		}else
		{
			return b;	
		}
				
	}
	
	public boolean isPrime(int n)
	{
	
		boolean isPrime = true;
		for(int i = 2 ; i*2<n;i++)
		{
			if(n%i == 0)
			{
				isPrime = false;
				return isPrime;
			}
		}
		
		return isPrime;
	}
	
	
	
}
