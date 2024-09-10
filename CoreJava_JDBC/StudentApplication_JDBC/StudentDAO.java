package com.evergent.CoreJava.StudentApplication_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.mysql.jdbc.PreparedStatement;

public class StudentDAO  {
	
	                      
	public int addStudent(StudentBean sb)
	{
		int t=0;
		 Connection conn = null;
	      String url = "jdbc:mysql://localhost:3306/";
	      String dbName = "evergentdb";
	      String driverName = "com.mysql.jdbc.Driver";
	      String userName = "root";
	      String password = "admin";
	      try{
	        Class.forName(driverName);   //Loading the Driver ,   Driver d1=new Driver()
	        conn = DriverManager.getConnection(url+dbName, userName, password);
	        try{
	          String sql="insert into student values(?,?,?,?,?,?)";
	          PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(sql);
	            pstmt.setInt(1, sb.getStudentId());                            
	            pstmt.setString(2, sb.getSname());                      
	            pstmt.setString(3, sb.getCourse());                       
	            pstmt.setFloat(4, sb.getT1());                      
	            pstmt.setFloat(5, sb.getT2());  
	            pstmt.setFloat(6, sb.getAvg());
	            pstmt.addBatch();

	            // Execute the insert statement
	            int rowsAffected = pstmt.executeUpdate();
//	            t=rowsAffected.length;
	            System.out.println("Rows inserted: " + rowsAffected);      
	        }
	        catch(SQLException s){
	          System.out.println(s);
	        }
	        conn.close();
	      }
	      catch (Exception e){
	        e.printStackTrace();
	      }
	      return t;
	}

}
