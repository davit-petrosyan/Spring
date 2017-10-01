package java_config.qualifire;

import javax.inject.Named;

import org.springframework.stereotype.Component;

//@Component("bike")

@Named("bike")
public class Bike implements Vehicle {

	public void drive() {
		System.out.println("Bike ");
	}

}
