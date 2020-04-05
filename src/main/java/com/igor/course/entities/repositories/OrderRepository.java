package com.igor.course.entities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.igor.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
