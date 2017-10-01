package java_config.qualifire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = 
        		new AnnotationConfigApplicationContext("java_config.qualifire");
        Garage garage = context.getBean(Garage.class);
        garage.move();
        
    }
}
