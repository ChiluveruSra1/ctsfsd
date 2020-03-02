package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
	public class FeignProxyController {
		
		@Autowired
		private FeignUserClient feignUserClient;
		@RequestMapping("/users")
		public List<User> getAllGroups(){
			
			return feignUserClient.getAllGroups();
		}
		
		@RequestMapping("/id")
		public String userDetails(){
			
			return feignUserClient.userDetails("5e58b4d03b0c0f49de0794be");
		}
	}