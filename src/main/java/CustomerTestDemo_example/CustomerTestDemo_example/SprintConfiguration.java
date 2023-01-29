package CustomerTestDemo_example.CustomerTestDemo_example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SprintConfiguration {
	
	@Bean(name= "customerService")
public CustomerServiceImpl CustomerServiceImpl() {
	CustomerServiceImpl obj1 = new CustomerServiceImpl();
	return obj1;
}
}
