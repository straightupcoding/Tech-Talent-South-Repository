package com.tts.UsersAPI.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tts.UsersAPI.domain.User;
import com.tts.UsersAPI.domain.UserRepository;

@RestController
public class UserController {
	@Autowired
	private UserRepository repository;
	//Return all Users
	@GetMapping("/users")
	public List<User> getUsers(@RequestParam(value="state", required=false) String state){
	if (state != null) {
	return (List<User>) repository.findByStateResidence(state);
	}
	return (List<User>) repository.findAll();
	}
	//Find User by ID
	@GetMapping("/users/{id}")
	public Optional<User> getUserById(@PathVariable(value="id") Long id){
	return repository.findById(id);
	}
	//Create new User
	@PostMapping("/users")
	public ResponseEntity<Void> createUser(@RequestBody User user){
	repository.save(user);
	return new ResponseEntity<Void>(HttpStatus.OK);
	}
	//Update
	@PutMapping("/users/{id}")
	public void createUser(@PathVariable(value="id") Long id, @RequestBody User user){
	repository.save(user);
	}
	//Delete Existing User
	@DeleteMapping("/users/{id}")
	public void createUser(@PathVariable(value="id") Long id){
	repository.deleteById(id);
	}
}
