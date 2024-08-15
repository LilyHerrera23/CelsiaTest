package com.celsia.prueba.service;

import com.celsia.prueba.model.Customer;

import java.util.List;

public interface ICostumer {
    List<Customer> getAllCustomers();
    Customer findByIdentification(String identification);
    String saveCustomer(Customer customer);

}