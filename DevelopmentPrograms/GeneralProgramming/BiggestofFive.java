package com.evergent.scr.GeneralProgramming;

public class BiggestofFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=80,c=30,d=100,e=60;
		if(a>b && a>c && a>d && a>e) {
			System.out.println("A is Big");
		}
		else if(b>a && b>c && b>d && b>e) {
			System.out.println("B is Big");
		}
		else if(c>a && c>b && c>d && c>e) {
			System.out.println("C is Big");
		}
		else if(d>a && d>b && d>c && d>e) {
			System.out.println("D is Big");
		}
		else  {
			System.out.println("E is Big");
		}
		

	}

}
