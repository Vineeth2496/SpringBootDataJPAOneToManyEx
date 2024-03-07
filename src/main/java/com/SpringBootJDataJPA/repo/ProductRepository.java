package com.SpringBootJDataJPA.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringBootJDataJPA.model.Model;
import com.SpringBootJDataJPA.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
