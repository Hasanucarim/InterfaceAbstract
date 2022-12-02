package org.example.Entities;

import java.time.LocalDate;

public class Customer {
    public Customer(String firstName, String lastName, LocalDate dateOfBirth, String nationalId) {
        FirstName = firstName;
        LastName = lastName;
        DateOfBirth = dateOfBirth;
        NationalId = nationalId;



    }

    public String FirstName;
    public String LastName;
    public LocalDate DateOfBirth;
    public String NationalId;
}
    

    