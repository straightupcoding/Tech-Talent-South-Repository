package com.tts.UsersAPI.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	@GetMapping("/users")
	public List<User> getUsers(@RequestParam(value="state", required=false) String state){
	if (state != null) {
	return (List<User>) repository.findByStateResidence(state);
	}
	return (List<User>) repository.findAll();
	}
	@GetMapping("/users/{id}")
	public Optional<User> getUserById(@PathVariable(value="id") Long id){
	return repository.findById(id);
	}
	@PostMapping("/users")
	public void createUser(@RequestBody User user){
	repository.save(user);
	}
	@PutMapping("/users/{id}")
	public void createUser(@PathVariable(value="id") Long id, @RequestBody User user){
	repository.save(user);
	}
	@DeleteMapping("/users/{id}")
	public void createUser(@PathVariable(value="id") Long id){
	repository.deleteById(id);
	}
}
