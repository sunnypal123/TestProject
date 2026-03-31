package com.ty;

public class Student {
	
	String name;
	int age;
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public void details() {
		System.out.println("Name :" + name);
		System.out.println("Age : " + age);
	}
	
	
	public void play() {
		System.out.println(" student are playing cricket");
	}

}
