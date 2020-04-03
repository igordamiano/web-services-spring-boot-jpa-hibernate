package com.igor.course.entities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.igor.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
