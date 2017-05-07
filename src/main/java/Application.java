import com.dy.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Admin on 07-02-2017.
 */
public class Application {
    public static void main(String[] args) {
//        CustomerService customerService = new CustomerServiceImpl();

        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerService service = appContext.getBean("customerService", CustomerService.class);

        System.out.println(service.findAll().get(0).getFirstName());// first element, that we hardcoded, just for testing the happy path
    }
}
