package com.fhissa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fhissa.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
