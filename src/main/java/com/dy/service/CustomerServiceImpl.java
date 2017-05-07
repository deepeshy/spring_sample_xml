package com.dy.service;

import com.dy.model.Customer;
import com.dy.repository.CustomerRepository;

import java.util.List;

/**
 * Created by Admin on 07-02-2017.
 */
public class CustomerServiceImpl implements CustomerService {
    CustomerRepository customerRepository;// = new HibernateCustomerRepositoryImpl();

    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public CustomerServiceImpl() {
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
