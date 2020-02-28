package com.example.demo;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RecommendationRestController {

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping(value = "/recommendations", method = RequestMethod.GET)
	@ResponseBody
	public Movie[] recommendation() {
		Movie[] movie=restTemplate.getForObject("http://movie-service/movie/all", Movie[].class);

		return movie;
	}

}
