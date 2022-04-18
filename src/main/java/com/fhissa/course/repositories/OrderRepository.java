package com.fhissa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fhissa.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
