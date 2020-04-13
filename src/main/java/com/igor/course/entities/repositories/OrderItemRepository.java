package com.igor.course.entities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.igor.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
