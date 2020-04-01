package com.qa.main;

public class Fibonacci 
{
	private int[] fibonacciArray = new int[1000];
	
	public void getFibonacci(int sequenceLength)
	{
		for (int i = 0; i < sequenceLength; i++)
		{
			if (i == 0)
			{
				fibonacciArray[i] = i;
				System.out.println(i);
			}
			else if (i == 1)
			{
				fibonacciArray[i] = i;
				System.out.println(i);
			}
			else
			{
				fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
				System.out.println(fibonacciArray[i]);
			}
		}
	}

}
