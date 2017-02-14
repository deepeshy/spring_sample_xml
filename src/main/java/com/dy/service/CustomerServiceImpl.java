package com.dy.service;

import com.dy.model.Customer;
import com.dy.repository.CustomerRepository;
import com.dy.repository.HibernateCustomerRepositoryImpl;

import java.util.List;

/**
 * Created by Admin on 07-02-2017.
 */
public class CustomerServiceImpl implements CustomerService {
    CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
