import com.dy.service.CustomerService;
import com.dy.service.CustomerServiceImpl;

/**
 * Created by Admin on 07-02-2017.
 */
public class Application {
    public static void main(String[] args) {
        CustomerService customerService = new CustomerServiceImpl();
        System.out.println(customerService.findAll().get(0).getFirstName());// first element, that we hardcoded, just for testing the happy path
    }
}
