package com.evergent.CoreJava.Rithen.CaseStudy3;

public class EmployeeBean  {
	private int id;
	private String name;
	private String Dept;
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setDept(String Dept) {
		this.Dept = Dept;
	}
	public String getDept() {
		return Dept;
	}	
	public String toString() {
		return "Employee Id :"+getId()+"\n"+"Person Name : "+getName()+"\n"+"Department :"+getDept();
	}
	
	
	
}
