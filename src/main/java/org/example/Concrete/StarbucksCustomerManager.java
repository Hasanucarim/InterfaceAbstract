package org.example.Concrete;

import Abstract.BasedCustomerManager;
import Abstract.ICustomerCheckService;
import jdk.jshell.spi.ExecutionControl;
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
        super.save(customer);
        if (_customerCheckService.ChechifRealPerson(customer));
        save(customer);
        {
        }

        }
    }