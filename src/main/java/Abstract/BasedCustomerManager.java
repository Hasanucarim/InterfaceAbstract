package Abstract ;

import org.example.Entities.Customer;

public abstract class BasedCustomerManager implements ICustomerService  {
    @Override
    public  void Save(Customer customer) {
        System.out.println("Saved to db: " + customer.FirstName + " " + customer.LastName + " " + customer.DateOfBirth);

    }
    }
