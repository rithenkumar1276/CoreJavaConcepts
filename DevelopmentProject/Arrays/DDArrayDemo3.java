package com.evergent.CoreJava.Arrays;

public class DDArrayDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr=new int[5][5];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(i==j || i+j==arr.length-1) {
				arr[i][j]=7;
				}
				else {
					arr[i][j]=0;
				}
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
