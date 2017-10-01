package java_config.qualifire;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	
	@Bean
	Bike bike() {
		return new Bike();
	}

	@Bean
	Car car() {
		return new Car();
	}

//	@Bean
//	Garage garage() {
//		return new Garage(car(), "Yerevan");
//	}
}
