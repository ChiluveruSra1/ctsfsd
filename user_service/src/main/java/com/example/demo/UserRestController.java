package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserRestController {
	private UserService userService;

	@Autowired
	public UserRestController(UserService userService) {
		super();
		this.userService = userService;
	}

	@PostMapping("/create")
	public User createUser(@RequestBody User user) {
		return userService.createUser(user);
	}

	@GetMapping("/all")
	public List<User> findAll() {
		return userService.findAll();
	}

	@GetMapping("/id/{itemId}")
	public Optional<User> findById(@PathVariable String itemId) { 
		return userService.findById(itemId);
	}
	
	@GetMapping("/email/{email}")
	public Optional<User> findByEmail(@PathVariable String email) { 
		return userService.findByEmail(email);
	}
	  
	@DeleteMapping("/deleteall")
	void deleteItems() {
		userService.deleteUsers();
	}

}
