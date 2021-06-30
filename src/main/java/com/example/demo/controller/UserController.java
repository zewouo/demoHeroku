package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.UserDetail;
import com.example.demo.repository.UserRepository;

@RestController
@Transactional
@CrossOrigin(maxAge = 3600)
@RequestMapping("api")
public class UserController {
@Autowired
UserRepository userRepository;
	
@GetMapping("/user")
public List<UserDetail> getUsersdetails()
{
return (List<UserDetail>) userRepository.findAll();	
}
@PostMapping("/user")
public UserDetail adduser(@Valid @RequestBody UserDetail currentUser)
{
return userRepository.save(currentUser);	
}
@GetMapping("/user/{id}")
public Optional<UserDetail> getUserById(@PathVariable(value = "id") Long userId)
{
return userRepository.findById(userId);	
}
@DeleteMapping("/user/{id}")
public ResponseEntity<?> deleteUser(@PathVariable(value = "id") Long userId)
{
	userRepository.deleteById(userId);
	return ResponseEntity.ok().build();
	}
}
