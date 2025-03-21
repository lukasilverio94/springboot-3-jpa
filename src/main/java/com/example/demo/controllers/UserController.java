package com.example.demo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserController {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Maria", "maria@gmail.com", "999999", "9999999");
		return ResponseEntity.ok().body(u);
	}	
}
