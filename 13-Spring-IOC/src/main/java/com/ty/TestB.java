package com.ty;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestB {
    public static void main(String[] args) {

        // Step 1: Load Spring container with config-a.xml
        ConfigurableApplicationContext app =
            new ClassPathXmlApplicationContext("config-a.xml");

        // Step 2: Get Employee bean and call project()
        Employee employee = (Employee) app.getBean("empBean");
        employee.project();

        // Step 3: Get Student bean and call play()
        //Student student = (Student) app.getBean("studentBean");
        //student.play();

        // Step 4: Close the container
        app.close();
    }
}
