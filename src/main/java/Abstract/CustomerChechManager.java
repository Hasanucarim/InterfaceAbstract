package Abstract;

import Abstract.ICustomerCheckService;
import Abstract.ICustomerService;
import org.example.Entities.Customer;

public class CustomerChechManager implements ICustomerCheckService{
    @Override
    public boolean ChechifRealPerson(Customer customer) {
    return true;
    }
}
