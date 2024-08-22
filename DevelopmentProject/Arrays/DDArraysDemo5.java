package com.evergent.CoreJava.Arrays;

public class DDArraysDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] arr=new String[5][5];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]="JAVA";
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(" "+arr[i][j]);
			}
			System.out.println();
		}

	}

}
