package org.example.Concrete;

import Abstract.BasedCustomerManager;
import Abstract.CustomerChechManager;
import Abstract.ICustomerCheckService;
import org.example.Entities.Customer;

public class StarbucksCustomerManager extends BasedCustomerManager {
    private ICustomerCheckService _customerCheckService;

    public StarbucksCustomerManager(CustomerChechManager customerChechManager) {
        super();
    }

    public ICustomerCheckService get_customerCheckService() {
        return _customerCheckService;
    }

    @Override
    public void save(Customer customer) {
        if (_customerCheckService.ChechifRealPerson(customer));
        save(customer);
        {
        }

        }
    }