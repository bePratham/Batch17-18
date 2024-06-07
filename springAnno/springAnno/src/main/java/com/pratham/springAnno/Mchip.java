package com.pratham.springAnno;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Mchip implements MobileProcessor{
	
	public void process() {
		System.out.println("World's best mobile chip M3");
	}
}
