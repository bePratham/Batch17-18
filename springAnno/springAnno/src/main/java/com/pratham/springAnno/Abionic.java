package com.pratham.springAnno;

import org.springframework.stereotype.Component;

@Component("Abionic")
public class Abionic implements MobileProcessor{
	public void process() {
		System.out.println("A14 bionic chip");
	}
}

