import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.sahoora.repository.CustomerRepository;
import com.sahoora.repository.HibernateCustomerRepositoryImpl;
import com.sahoora.service.CustomerService;
import com.sahoora.service.CustomerServiceImpl;

@Configuration
@ComponentScan("org.sahoora")
public class AppConfig {
	
	@Bean(name="customerService")
	public CustomerService getCustomerService() {
		CustomerServiceImpl customerServiceImpl = new CustomerServiceImpl();
		//customerServiceImpl.setCustomerRepository(getCustomerRespository());
		return customerServiceImpl;
	}
	
	@Bean(name="customerRepository")
	public CustomerRepository getCustomerRespository() {
		return new HibernateCustomerRepositoryImpl();
	}
}
