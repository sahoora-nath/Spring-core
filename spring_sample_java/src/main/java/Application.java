import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sahoora.service.CustomerService;

public class Application {

	public static void main(String[] args) {

		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		CustomerService custService = appContext.getBean("customerService", CustomerService.class);
		
		CustomerService custService2 = appContext.getBean("customerService", CustomerService.class);
		System.out.println(custService);
		System.out.println(custService2);
		
		//CustomerService custService = new CustomerServiceImpl();
		System.out.println(custService.findAll().get(0).getFirstName());
	}

}
