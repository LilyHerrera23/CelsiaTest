package com.celsia.prueba.impl;

import com.celsia.prueba.model.Customer;
import com.celsia.prueba.repository.CustomerRepo;
import com.celsia.prueba.service.ICostumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CostumerImpl implements ICostumer {
    @Autowired
    private  CustomerRepo customerRepository;
    @Override
    public List<Customer> getAllCustomers() {
        return (List<Customer>) customerRepository.findAll();
    }
    @Override
    public Customer findByIdentification(String identification) {
        return customerRepository.findByIdentification(identification);
    }
    @Override
    public String saveCustomer(Customer customer) {
        customerRepository.save(customer);
        return customer.getIdentification();
    }
}
