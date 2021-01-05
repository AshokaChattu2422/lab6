package com.jpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.entities.Customer;

public interface CustomerRepo extends JpaRepository<Customer,Integer> {

}
