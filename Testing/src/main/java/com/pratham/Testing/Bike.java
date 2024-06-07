package com.pratham.Testing;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{
	public void drive() {
		System.out.println("I am driving a Bike");
	}
}
