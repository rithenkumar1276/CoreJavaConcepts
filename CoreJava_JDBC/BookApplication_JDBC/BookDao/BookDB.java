package com.evergent.CoreJava.BookDao;
import java.sql.*;

public class BookDB 
{
  public static Connection getConnection()
  throws Exception
  {
	 Class.forName("com.mysql.jdbc.Driver");
	  Connection  conn = DriverManager.getConnection(
			  "jdbc:mysql://localhost:3306/evergentdb",
			  "root",
			  "admin"); 
	/*
	  String driverName = "oracle.jdbc.driver.OracleDriver";
	  Class.forName(driverName);
	  Connection conn = DriverManager.getConnection(
	              "jdbc:oracle:thin:@localhost:1521:XE","capgmulesoft","capgmulesoft");
	*/
	return conn;
  }

}
