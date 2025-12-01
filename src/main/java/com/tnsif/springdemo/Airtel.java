package com.tnsif.springdemo;

public class Airtel implements Sim {

	@Override
	public void calling() {
		System.out.println("Browsing using Airtel network");
		
	}

	@Override
	public void browsing() {
		System.out.println("Calling using Airtel network");
		
	}
}