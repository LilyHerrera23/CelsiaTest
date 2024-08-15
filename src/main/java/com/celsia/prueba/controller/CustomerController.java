package com.celsia.prueba.controller;

import com.celsia.prueba.model.Customer;
import com.celsia.prueba.service.ICostumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("CustomerController")
public class CustomerController {

    @Autowired
    private ICostumer customerService;

    @GetMapping("getAllCustomers")
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }
    @GetMapping("getCustomerById/{identification}")
    public Customer getCustomerById(@PathVariable String identification){
        return customerService.findByIdentification(identification);
    }
    @PostMapping("saveCustomer")
    public String saveCustomer(@RequestBody Customer customer){
        return customerService.saveCustomer(customer);
    }
       @PostMapping("deleteCustomer")
    public String deleteCustomer(@RequestBody Customer customer){
        return customerService.deleteCustomer(customer);
    }

}
