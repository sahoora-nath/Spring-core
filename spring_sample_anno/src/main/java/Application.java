import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sahoora.service.CustomerService;

public class Application {

	public static void main(String[] args) {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerService custService = appContext.getBean("customerService", CustomerService.class);
		
		System.out.println(custService.findAll().get(0).getFirstName());
	}

}
