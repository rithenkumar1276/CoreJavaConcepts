package com.evergent.CoreJava.Abstract1;

public class ProductImpl1 extends Product {
	public void show() {
		System.out.println("My Local Method");
	}
	public void NewProduct() {
		System.out.println("My New Product");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductImpl1 obj=new ProductImpl1();
		obj.show();
		obj.NewProduct();
		obj.AllProduct();
	}

}
