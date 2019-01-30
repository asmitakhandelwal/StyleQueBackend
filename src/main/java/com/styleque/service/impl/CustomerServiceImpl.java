package com.styleque.service.impl;

import com.styleque.dao.CustomerDAO;
import com.styleque.model.Customer;
import com.styleque.model.Product;
import com.styleque.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerDAO customerDAO;

    public void addCustomer(Customer customer){
        customerDAO.addCustomer(customer);
    }

    public Customer getCustomerById(int customerId){
        return customerDAO.getCustomerById(customerId);
    }

    public List<Customer> getAllCustomers(){
        return customerDAO.getAllCustomers();
    }

    public Customer getCustomerByUsername (String username){
        return customerDAO.getCustomerByUsername(username);
    }

   @Override
	public void UpdateCustomer(Customer customer) {
		customerDAO.UpdateCustomer(customer);
    }	
}