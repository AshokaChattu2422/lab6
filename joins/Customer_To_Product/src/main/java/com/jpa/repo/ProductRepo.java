package com.jpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpa.entities.Product;
@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {

}
