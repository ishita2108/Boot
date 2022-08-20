package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.config.AppConfig;

public class Main {

	public static void main(String[] args) {
//		Vehicle vehicle = new Car();
//		Passenger passenger = new Passenger();
//		passenger.setName("Ishita");
//		passenger.setVehicle(vehicle);
//		passenger.travel();

		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		Passenger passenger = (Passenger) ctx.getBean("p");
		passenger.travel();
	}

}
