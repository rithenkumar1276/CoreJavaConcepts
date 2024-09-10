package com.evergent.CoreJava.Rithen.CaseStudy3;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class EmployeeImp implements EmployeeInterface {
	HashMap<Integer,EmployeeBean> emplist=null;
	public EmployeeImp() {
		emplist=new HashMap<>();
	}
	
	@Override
	public String addEmployee(EmployeeBean e) {
		emplist.put(e.getId(), e);
		int i=e.getId();
		String res=String.valueOf(i);
		return res;
	} 

	@Override
	public void retrieveByIdName(int id) {
		if(emplist.size()>0 && emplist!=null) {
		if (emplist.containsKey(id)) {
            System.out.println(emplist.get(id));
        } else {
            System.out.println("Map does not contain the ID");
        }
		}
		else {
			System.out.println("No Elements in HashMap.....Please Insert some Data");
		}
			
	}
	public void updateEmployeeDatails(int id) {
		if(emplist.size()>0 && emplist!=null){
			Scanner sc=new Scanner(System.in);
			if (emplist.containsKey(id)) {
					    System.out.println("Enter Updated new Employee Name :");    //emplist.put(id,emp1.
					    EmployeeBean emp1=emplist.get(id);
					    emp1.setName(sc.nextLine());
					    System.out.println("Enter Updated new Employee Department :");
					    emp1.setDept(sc.nextLine());
					    System.out.println("New Employee Details :");
					    System.out.println("-------------------------");
					    System.out.println(emplist.get(id));
						System.out.println("-------------------------");
				
				}
			}
		else {
			System.out.println("Enter the Elements in HashMap");
		}
			
	}

	@Override
	public void  removeEmployee(int id) {
			if(emplist.size()>0){
				if (emplist.containsKey(id)) {
					emplist.remove(id);
					System.out.println("Removed the person id "+id);
				}
				else {
					System.out.println("No id found .... Please enter correct id");
				}
			}else{
				System.out.println("No element in Hash Map.....");
			}
	}
	

	public void dispalyAllEmployee(){
		if(emplist.size()>0 && emplist!=null){
			
			for (EmployeeBean employee : emplist.values()) {
				System.out.println("______________");
	            System.out.println(employee);
	            System.out.println("______________");
	        }
		}
		else {
			System.out.println("No element in Hash Map.....");
		}
	}
			
	}
	

