package com.igor.course.entities.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.igor.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<List<User>> findAll(){

		
		User u = new User(1L, "Maria", "maria@gmail.com", "9999-9999", "sua senha");
		User u1 = new User(2L, "João", "joao@gmail.com", "8888-8888", "senha123");
		
		List<User> list = Arrays.asList(u, u1);
		
		return ResponseEntity.ok().body(list);
	}
	
}
