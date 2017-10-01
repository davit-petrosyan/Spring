package java_config.qualifire;

import javax.inject.Named;

import org.springframework.stereotype.Component;

@Component("car")

//@Named("car")

public class Car implements Vehicle {

	public void drive() {
			System.out.print("Car");
	}

}
