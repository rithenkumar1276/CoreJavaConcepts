package com.evergent.CoreJava.oops;

    class myadd{
	public void add() {
		System.out.println("addition of a and b is ="+(10+20));
	}
}
    class mymul extends myadd{
    	public void mul() {
    		System.out.println("multiplication of a and b is ="+(10* 20));
    	}
    }
    class mydivi extends mymul{
    	public void divi() {
    		System.out.println("Division of a and b is ="+(10/20));
    	}
    }

public class MultiLevelInheritance extends mydivi {

	public void myshow() {
		System.out.println("Local method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiLevelInheritance obj=new MultiLevelInheritance();
		obj.myshow();
		obj.add();
		obj.mul();
		obj.divi();

	}
}
