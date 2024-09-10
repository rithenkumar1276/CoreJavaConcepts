package com.evergent.CoreJava.io.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ProductSerializable {
	public static void main(String[] args) {
		try {
			
		FileOutputStream fos =new FileOutputStream("c://mydata/product1.txt");		
			//FileOutputStream fos =new FileOutputStream("product1.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			
			Product p1=new Product(1001,"Hellos",450);
			Product p2=new Product(1002,"Keybord:Welcome",950);
			Product p3=new Product(1003,"Laptop",65000);
			
			oos.writeObject(p1);
			oos.writeObject(p2);
			oos.writeObject(p3);
			System.out.println("Write Object into product.txt");
			
			oos.close();
			
		}
		catch(Exception e) {
			System.out.println("I can handle :"+e);
		}
	}

}