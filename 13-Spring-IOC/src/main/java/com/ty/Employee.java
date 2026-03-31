package com.ty;

public class Employee {
	String Eid;
	String name;
	
	double salary;
	
	
	public Employee() {
		
	}

	public Employee(String eid, String name, double salary) {
		Eid = eid;
		this.name = name;
		this.salary = salary;
		
	}
	
	
	public void display() {
		
		System.out.println("name :"+ name);
		System.out.println("Eid :"+ Eid);

		System.out.println("Salary :"+ salary);
		
		

		
	}
	
	public void project() {
		System.out.println("employee waorking on project");
	}
	
	
	
	

}
