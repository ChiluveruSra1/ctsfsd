package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

	private UserRepositry userRepositry;

	@Autowired
	public UserServiceImpl(UserRepositry userRepositry) {
		super();
		this.userRepositry = userRepositry;
	}

	@Override
	@Transactional
	public User createUser(User user) {
		// TODO Auto-generated method stub
		return userRepositry.save(user);
	}

	@Override
	@Transactional
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userRepositry.findAll();
	}

	@Override
	  @Transactional
	  public Optional<User> findById(String id) { 
		return userRepositry.findById(id);
	}

	@Override
	@Transactional
	public void deleteUsers() { 
		userRepositry.deleteAll();
	}

	@Override
	@Transactional
	public Optional<User> findByEmail(String email) {
		// TODO Auto-generated method stub
		return userRepositry.findByEmail(email);
	}
	  
	

}
