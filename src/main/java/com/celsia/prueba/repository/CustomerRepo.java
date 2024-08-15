package com.celsia.prueba.repository;

import com.celsia.prueba.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends CrudRepository<Customer,Long> {
    Customer findByIdentification(String identification);
}
