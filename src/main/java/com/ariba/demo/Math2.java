package com.ariba.demo;

public class Math2 {

	public int multiply(int a, int b)
	{ 
		int sum = 0;
		for(int i=1; i<=b; i++)
		{
			// add multiple times to simulate multiplication
			sum += a;
		}
		return sum;
	}
}
