package com.example.postgresql.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.postgresql.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long>{
	List<Customer> findByFirstName(String FirstName);
	List<Customer> findAll();
}

