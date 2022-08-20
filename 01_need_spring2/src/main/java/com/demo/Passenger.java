package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


//


//<property name ="vehicle" ref="v"/>
//</bean>

@Component(value="passenger")  //<bean id="passenger"  class="com.demo.Passenger">
public class Passenger {
	
	@Value("Ishita")  //<property name ="name" value="Ishitaa"/>
	private String name;
	
	@Autowired
	private Vehicle vehicle;
	
	
	public Passenger() {
		System.out.println("Passenger constructor is called");
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}


	public void travel() {
		System.out.println("name : "+ name);
		vehicle.move();
	}
	
}
