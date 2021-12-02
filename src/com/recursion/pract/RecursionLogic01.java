package com.recursion.pract;

public class RecursionLogic01 {

	static RecursionLogic01 obj = new RecursionLogic01();
	
	public static void main(String[] args) {
		int factorial = obj.factorial(5);
		System.out.println("Factorial of 5 is "+factorial);
	}

	public int factorial(int n) {
		if(n==0 || n==1)
			return 1;
		else
			return n*factorial(n-1);
	}
}
