package com.tnsif.springdemo;

public class Jio implements Sim {

	@Override
	public void browsing() {
		System.out.println("Browsing using Jio network");
		
	}

	@Override
	public void calling() {
		System.out.println("Calling using Jio network");
		
	}

}
