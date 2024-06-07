package com.pratham.Testing;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
//        Car car = new Car();
//        car.drive();
//        Bike obj = new Bike();
//        obj.drive();
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); 
//        	Vehicle obj = (Vehicle)context.getBean("car");
//        	Vehicle obj = (Vehicle)context.getBean("vehicle");
        	
//    	Car obj = (Car)context.getBean("car");
        	Tyre t = (Tyre)context.getBean("tyre");
        	t.setBrand("MRF");
//    		obj.drive();
        	System.out.println(t);
        	
        	
    }
}
