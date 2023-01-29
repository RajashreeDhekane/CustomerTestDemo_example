package CustomerTestDemo_example.CustomerTestDemo_example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(SprintConfiguration.class);
    	CustomerServiceImpl customerservicebean= (CustomerServiceImpl) context.getBean("customerService");
    	System.out.println(customerservicebean.createCustomer());
    	
    }
}
