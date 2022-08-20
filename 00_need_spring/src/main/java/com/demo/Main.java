package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
//		Vehicle vehicle = new Car();
//		Passenger passenger = new Passenger();
//		passenger.setName("Ishita");
//		passenger.setVehicle(vehicle);
//		passenger.travel();

		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		Passenger passenger = (Passenger) ctx.getBean("passenger");
		passenger.travel();
	}

}
