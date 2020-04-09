package com.igor.course.entities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.igor.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
