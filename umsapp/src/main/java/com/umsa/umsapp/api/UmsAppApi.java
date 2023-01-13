package com.umsa.umsapp.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.umsa.umsapp.dto.UserDTO;
import com.umsa.umsapp.entity.User;
import com.umsa.umsapp.service.UmsAppService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class UmsAppApi {
	@Autowired
	UmsAppService service;

	@GetMapping("/users")
	public List<User> getAllUsers() {
		return service.getAllUsers();
	}

	@PostMapping("/users")
	public User addUser(@RequestBody UserDTO user) {
		return service.addUser(user);
	}

	
	 @GetMapping("/users/{userId}") 
	 public User getUserById(@PathVariable int userId) { 
		 return service.getUserById(userId);
	 }
	 

	@DeleteMapping("/users/{userId}")
	public void deleteUserById(@PathVariable int userId) {
		service.deleteUserById(userId);
	}

	
	@PutMapping("/users/{userId}") 
	public User editUser(@PathVariable int userId, @RequestBody UserDTO user) { 
		return service.editUser(userId, user);
	}
	 
}
