package com.fhissa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fhissa.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
