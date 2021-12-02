package com.recursion.pract;

public class MainClassLogic {
	static FibonacciLogic03 objFibo = new FibonacciLogic03();
	static RecursionLogic01 objFac = new RecursionLogic01();

	public static void main(String[] args) {
		System.out.println("fibonacci of 5th term = " + objFibo.fib(5));
		int factorial = objFac.factorial(10);
		System.out.println("Factorial of 10 is " + factorial);
	}
}
