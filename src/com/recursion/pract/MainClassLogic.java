package com.recursion.pract;

public class MainClassLogic {
	static FibonacciLogic03 objFibo = new FibonacciLogic03();

	public static void main(String[] args) {
		System.out.println("fibonacci of 5th term = " + objFibo.fib(5));
	}
}
