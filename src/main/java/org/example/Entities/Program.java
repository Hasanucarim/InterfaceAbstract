package org.example.Entities;

import Abstract.BasedCustomerManager;
import Abstract.CustomerChechManager;
import org.example.Concrete.StarbucksCustomerManager;


public class Program {
    static void Main(String[] args) {

    }

    public  void Save(Customer customer) {
        System.out.println("Saved to db: " + customer.FirstName + " " + customer.LastName + " " + customer.DateOfBirth);

    }
}