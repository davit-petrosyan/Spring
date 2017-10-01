package java_config.qualifire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

@Component
public class Garage {
	
	String address;
	Vehicle car;
	

	@Inject
	public void setAddress(@Value("Armenia")String address) {
		this.address = address;
	}

	
// Using Setter Injection
// 1)	
//	@Inject
//	@Qualifier("car")
// 2)	
//	@Autowired
//	@Qualifier("bike")
// 3) 
//	@Resource(name="bike")
// 4) 
// 	
	@Resource
	@Named("car")
	public void setCar(Vehicle car) {
		this.car = car;
	}

	
//Using Constructor Injection	
//  1)	
//	@Autowired
//	@Named("car")
	
//	2)
//	@Inject
//	@Named("bike")
//
//	public Garage(Vehicle v, @Value("Yere1") String address) {
//		this.car = v;
//		this.address = address;
//		
//	}
	
	

	public void move() {
		car.drive();	
			System.out.println(" address: " + address);
	}

}
