package com.springboot.rest.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.rest.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	 
}