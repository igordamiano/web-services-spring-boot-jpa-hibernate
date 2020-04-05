package com.igor.course.entities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.igor.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
