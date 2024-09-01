package com.evergent.CoreJava.JavaBeans;

import java.io.Serializable;
public class StudentBeans implements Serializable{
	private int sno;
	private String sname;
	private String address;
	public void setSno(int sno) {
		this.sno = sno;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String toString() {
		return "sno: "+sno+"\nsname: "+sname+"\naddress: "+address;
	}
}