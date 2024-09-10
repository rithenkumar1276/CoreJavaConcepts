package com.evergent.CoreJava.io.serialization;


import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerializableData {

	public static void main(String[] args) {
		
		  try {
			  Product  p=new Product();
			 // FileInputStream fis= new FileInputStream("product.txt");
			  FileInputStream fis= new FileInputStream("c://mydata/product1.txt");
			  
			  ObjectInputStream ois=new ObjectInputStream(fis);
			  
			  while((p=(Product)ois.readObject())!=null){				  
				  
				  System.out.println("Product Data :"+p.getPid()+p.getPname()+p.getPrice());
				  
			  }
			  
			  
		  }
		catch(Exception e) {
			System.out.println("End of the file");
		}
	}

}