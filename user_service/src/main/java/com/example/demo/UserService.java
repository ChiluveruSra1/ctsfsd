package com.example.demo;

import java.util.List;
import java.util.Optional;

public interface UserService {

	public User createUser(User user);

	List<User> findAll();

	public Optional<User> findById(String itemId);

	public void deleteUsers();

	public Optional<User> findByEmail(String email);

}
