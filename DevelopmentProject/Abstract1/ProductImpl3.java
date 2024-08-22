package com.evergent.CoreJava.Abstract1;

public class ProductImpl3 extends Product3 {
	public ProductImpl3() {
		System.out.println("Normal Class ProductImpl3 Constructor");
	}
	public void show() {
		System.out.println("My Local Method");
	}
	public void NewProduct() {
		System.out.println("My New Product");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductImpl3 obj=new ProductImpl3();
		obj.show();
		obj.NewProduct();
		obj.AllProduct();
	}

}
