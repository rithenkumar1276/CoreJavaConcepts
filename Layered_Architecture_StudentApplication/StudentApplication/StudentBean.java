package com.evergent.CoreJava.StudentApplication;
import java.io.Serializable;

public class StudentBean implements Serializable {
	private String sname;
	private String course;
	private float t1;
	private float t2;
	private float avg;
	private String grade;
	private int sid;
	public int getStudentId() {
		return sid;
	}
	public void setStudentId(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public float getT1() {
		return t1;
	}
	public void setT1(float t1) {
		this.t1 = t1;
	}
	public float getT2() {
		return t2;
	}
	public void setT2(float t2) {
		this.t2 = t2;
	}
	public float getAvg() {
		return avg;
	}
	public void setAvg(float avg) {
		this.avg = avg;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
	
	
}
