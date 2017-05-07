package com.dy.repository;

import com.dy.model.Customer;
import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 07-02-2017.
 */

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Value("${dbUserName}")
    private String dbUserName;


    public void setDbUserName(String dbUserName) {
        this.dbUserName = dbUserName;
    }

    public List<Customer> findAll() {
        System.out.println("***"+dbUserName +"***");
        List<Customer> customers = new ArrayList<>();
        Customer customer = new Customer();
        customer.setFirstName("Deepesh");
        customer.setLastName("Yadav");
        customers.add(customer);
        return customers;
    }
}
