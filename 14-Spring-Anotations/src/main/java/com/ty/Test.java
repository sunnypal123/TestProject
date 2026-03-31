package com.ty;


import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ty.com.config.Config;

public class Test {
	public static void main(String[] args) {
		ConfigurableApplicationContext app = new AnnotationConfigApplicationContext(Config.class);
		
		Student student = (Student) app.getBean("student");
		student.read();
		
		
		CAR c = (CAR) app.getBean("carBean");
		c.speed();
		
		UserDetails us = (UserDetails) app.getBean("userDetails");
		
		us.details();
		
		
		
		System.out.println("--------------og-------");
		
		CAR car = app.getBean(CAR.class);
		car.speed();
		
		Student stud = app.getBean(Student.class);
		stud.read();
		
		UserDetails uss = app.getBean(UserDetails.class);
		
		uss.details();
				
		
		
		
	}

}
