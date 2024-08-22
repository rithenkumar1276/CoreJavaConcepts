package com.evergent.CoreJava.LogicalProgramming;

public class FibonacciDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		int a=0,b=1;
		for(int i=0;i<n;i++) {
			int c=a+b;
			a=b;
			b=c;
			System.out.print(" "+c);
		}

	}

}
