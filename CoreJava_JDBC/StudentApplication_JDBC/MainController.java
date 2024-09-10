package com.evergent.CoreJava.StudentApplication_JDBC;

import java.util.Scanner;

public class MainController {

	public static void main(String[] args) {
		while(true) {
		int studentId=(int)(Math.random() * 900) + 100;;
		String sName="";
		String course="";
		float test1=0;
		float test2=0;
		
		Scanner sin=new Scanner(System.in);
		
		System.out.println("Enter Student Name :");
		sName=sin.nextLine();
		System.out.println("Enter course :");
		course = sin.nextLine();
		//sin.nextLine();
		System.out.println("Enter the test1 marks:");
		test1 = sin.nextInt();
		if(test1>100) {
			System.out.println("Please Enter the marks below 100 ");
			test1=sin.nextInt();
		}
		System.out.println("Enter the test2 marks:");
		test2 = sin.nextInt();
		if(test2>100) {
			System.out.println("Please Enter the marks below 100 ");
			test2=sin.nextInt();
		}
		
		StudentService ss = new StudentService();
		
		int updeateCount=ss.addStudentData(studentId,sName,course,test1,test2);
		
		
		//last
		  System.out.println("Inserted :"+updeateCount+" record Successfully");
		
		
		}
		
	}

}
