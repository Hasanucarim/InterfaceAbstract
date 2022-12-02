package org.example.Entities;

import Abstract.BasedCustomerManager;
import org.example.Concrete.CustomerChechManager;
import org.example.Concrete.NeroCustomerManager;
import org.example.Concrete.StarbucksCustomerManager;


public class Program {
    static void Main(String[] args) {
        Customer FirstName = new Customer();
        Customer LastName = new Customer();
        Customer ID = new Customer();
        Customer DateofBirth = new Customer();


        FirstName.setName("Hasan");
        LastName.setName("Ucar");
        DateofBirth.setDateOfBirth(1985);


        BasedCustomerManager customerManager = new StarbucksCustomerManager(new CustomerChechManager());
        customerManager.save(new Customer (DateofBirth.getDateOfBirth(1985), FirstName.getName(),LastName.getName();
    }
}