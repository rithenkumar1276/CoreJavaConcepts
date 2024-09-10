package com.evergent.CoreJava.Rithen.CaseStudy3;

import java.util.Scanner;
 
public class Employee_Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmployeeInterface ep=new EmployeeImp();
		for(;;){
			System.out.println("\n 1.Add Employee \n 2.Retrive by Employee Id \n 3.Update Employee Details  \n 4.Remove Employee \n 5.dispaly All Employee \n 6. exit \n");
			int no=sc.nextInt();
			sc.nextLine();
			switch(no){
			case 1:int id=(int)(Math.random() * 900) + 100;
				   System.out.println("Enter the Name:");
				   String name=sc.nextLine();
				   System.out.println("Enter the Department :");
				   String dept=sc.nextLine();
				   EmployeeBean e=new EmployeeBean();
				   e.setId(id);
				   e.setName(name);
				   e.setDept(dept);
				   String message=ep.addEmployee(e);
				   System.out.println("Successfully  Id: "+message+" Added!");
				   break;
			case 2:System.out.println("Enter the Id:");
			   	   int id1=sc.nextInt();
			   	   ep.retrieveByIdName(id1);
			   	   break;
			  		 	   
			case 3:System.out.println("Enter the Id:");
			       int id2=sc.nextInt();
				   ep.updateEmployeeDatails(id2);
				   break;
			case 4:System.out.println("Enter the Id:");
		           int id3=sc.nextInt();
				   ep.removeEmployee(id3);
			       break;
			case 5:ep.dispalyAllEmployee();
			break;
			case 6:System.exit(0);
			}
			
		}
	}
}
	


