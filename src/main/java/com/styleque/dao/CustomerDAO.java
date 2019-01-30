package com.styleque.dao;

import com.styleque.model.Customer;
import com.styleque.model.Product;

import java.util.List;

public interface CustomerDAO {

    void addCustomer(Customer customer);

    Customer getCustomerById(int customerId);

    List<Customer> getAllCustomers();

    Customer getCustomerByUsername(String username);
    
    Customer UpdateCustomer(Customer customer);
}
