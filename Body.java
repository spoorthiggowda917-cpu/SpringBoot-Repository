package com.tnsif.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body {

	public static void main(String[] args) {
		
		// Load Spring configuration
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("Configuration is loaded");
        
        Human human=(Human) context.getBean("human");
        human.startPumping();


	}

}
