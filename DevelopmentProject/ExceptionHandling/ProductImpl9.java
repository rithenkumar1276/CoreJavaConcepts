package com.evergent.CoreJava.ExceptionHandling;
/** 14 Throws an exception will be executed method by method **/ 
class ProductNotFoundException extends Exception{
	public ProductNotFoundException(String message){
		System.out.println("The Message :"+message);
	}
}

public class ProductImpl9{
	int phno=105;
	public void myData() throws ProductNotFoundException  {
			if(phno>100) {
				throw new ProductNotFoundException("This Product is Not There");
			}
			else {
				System.out.println("Product is Using");
			}
		
	}
	public static void main(String[] args) {
		try {
		ProductImpl9 ep2=new ProductImpl9();
		ep2.myData();
		}
		catch(Exception e) {
			System.out.println("I can Handle "+e);
		}
	}

}
