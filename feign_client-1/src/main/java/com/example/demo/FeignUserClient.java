package com.example.demo;

import java.util.List;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient("user-service")
	public interface FeignUserClient {

		@RequestMapping(value = "/user/id/{userId}", method = RequestMethod.GET)
		//@LoadBalanced
		public String userDetails(@PathVariable("userId") String userId);
		//@LoadBalanced
		@RequestMapping(value = "/user/all", method = RequestMethod.GET)
		public List<User> getAllGroups();

	}
