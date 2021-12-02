package com.recursion.pract;

public class FibonacciLogic03 {
	public int fib(int n) {
		if (n<1) {
		System.out.println("This is not perfect");
		return -1;
		}
		else if(n==1 || n==2)
			return n-1;
		else 
			return fib(n-1)+fib(n-2);
	}
		

}
