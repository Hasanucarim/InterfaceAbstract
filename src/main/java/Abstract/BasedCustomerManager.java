package Abstract ;

import org.example.Entities.Customer;

public class BasedCustomerManager implements ICustomerService  {
    @Override
    public void save(Customer customer) {
        System.out.println("Saved to DB  :" + customer.getName());
    }
}
