package com.tnsif.dependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

    public static void main(String[] args) {
        // Load Spring configuration
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("Configuration is loaded");

        // Retrieve the bean from Spring context
        Student s1 = (Student) context.getBean("student");
        s1.display();
    }
}
