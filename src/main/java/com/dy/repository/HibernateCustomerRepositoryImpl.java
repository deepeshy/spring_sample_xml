package com.dy.repository;

import com.dy.model.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 07-02-2017.
 */


public class HibernateCustomerRepositoryImpl implements CustomerRepository {
    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<>();
        Customer customer = new Customer();
        customer.setFirstName("Deepesh");
        customer.setLastName("Yadav");
        customers.add(customer);
        return customers;
    }
}
