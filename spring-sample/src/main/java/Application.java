import com.sahoora.service.CustomerService;
import com.sahoora.service.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {

		CustomerService custService = new CustomerServiceImpl();
		System.out.println(custService.findAll().get(0).getFirstName());
	}

}
