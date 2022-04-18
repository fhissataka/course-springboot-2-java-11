package com.fhissa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fhissa.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
