package com.SpringBootJDataJPA.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringBootJDataJPA.model.Model;

public interface ModelRepository extends JpaRepository<Model, Integer> {

}
