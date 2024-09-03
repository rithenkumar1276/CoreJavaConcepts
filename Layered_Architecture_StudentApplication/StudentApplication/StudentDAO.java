package com.evergent.CoreJava.StudentApplication;

import java.util.ArrayList;

public class StudentDAO {
	
	                       //  100  corejava 250   c
	public int addStudent(StudentBean sb)
	{
		try{
			ArrayList stulist=new ArrayList();
			stulist.add(sb.getStudentId());
			stulist.add(sb.getSname());
			stulist.add(sb.getCourse());
			stulist.add(sb.getT1());
			stulist.add(sb.getT2());
			stulist.add(sb.getAvg());
			stulist.add(sb.getGrade());
			System.out.println("__________________");
			System.out.println(stulist);
			System.out.println("__________________");
			System.out.println("Student ID :"+sb.getStudentId());
			System.out.println("Student Name :"+sb.getSname());
			System.out.println("Student Course :"+sb.getCourse());
			System.out.println("Student Test1 Marks :"+sb.getT1());
			System.out.println("Student Test2 Marks :"+sb.getT2());
			System.out.println("Student Total Average Marks :"+sb.getAvg());
			System.out.println("Student Grade :"+sb.getGrade());
			System.out.println("__________________");
			
			return 1;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return 0;
		}
	}

}
