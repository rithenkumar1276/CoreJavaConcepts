package com.evergent.CoreJava.Arrays;

public class ArrayDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5];
		arr[0]=1;
		arr[1]=10;
		arr[2]=100;
		arr[3]=1000;
		arr[4]=10000;
		for(int i=0;i<5;i++) {
			System.out.print(" "+arr[i]);
		}
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}
		

	}

}
