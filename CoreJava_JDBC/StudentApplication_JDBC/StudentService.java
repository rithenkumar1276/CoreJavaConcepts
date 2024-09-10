package com.evergent.CoreJava.StudentApplication_JDBC;
public class StudentService {
	                           
	public int addStudentData(int sid,String sname,String course,float t1,float t2)
	{  
		float avg=(t1+t2)/2;
		
		String grade="";
	
	   if(avg>=91 && avg<=100)
	   {
		   grade = "A";
	   }
	   else if(avg>=81 && avg<=90)
	   {
		   grade = "B";
		   
	   }
	   else if(avg>=60 && avg<=80)
	   {
		   grade = "c";
	   }
	   else {
		   grade="fail";
	   }
		
		
		StudentDAO sDAO = new StudentDAO();
		StudentBean studentBean=new StudentBean();
	       studentBean.setStudentId(sid);	
	       studentBean.setSname(sname);
	       studentBean.setCourse(course);
	       studentBean.setT1(t1);
	       studentBean.setT2(t2);
	       studentBean.setGrade(grade);
	       studentBean.setAvg(avg);
		   int updateResult= sDAO.addStudent(studentBean);
		
		return 1;
	} 
}
