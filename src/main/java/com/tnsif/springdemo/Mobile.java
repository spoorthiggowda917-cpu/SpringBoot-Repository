package com.tnsif.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		// Load Spring configuration
        ApplicationContext c = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("Configuration is loaded");
        Sim a=(Jio) c.getBean("sim");
        a.browsing();
        a.calling();

	}

}
