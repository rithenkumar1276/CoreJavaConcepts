package com.evergent.CoreJava.ram.CaseStudy1;

public interface LibraryUser {
	public void registerAccount(int age) throws AgeNotSupportedException;
	public void requestBook(String btype) throws BookNotSupportedException;
}