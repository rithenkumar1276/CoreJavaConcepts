package com.evergent.CoreJava.Abstract1;

public class ProductImpl2 extends Product {
	public void show() {
		System.out.println("My Local Method");
	}
	public void NewProduct() {
		System.out.println("My New Product");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product obj=new ProductImpl2();
		obj.NewProduct();
		obj.AllProduct();
	}

}
