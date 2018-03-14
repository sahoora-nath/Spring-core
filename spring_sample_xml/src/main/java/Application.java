import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sahoora.service.CustomerService;

public class Application {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerService custService = applicationContext.getBean("customerService", CustomerService.class);
		System.out.println(custService);
		
		CustomerService custService2 = applicationContext.getBean("customerService", CustomerService.class);
		System.out.println(custService2);
		
		System.out.println(custService.findAll().get(0).getFirstName());
		
		//applicationContext.
	}

}
