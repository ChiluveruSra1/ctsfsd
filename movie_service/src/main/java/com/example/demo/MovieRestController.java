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
@RequestMapping("/movie")
public class MovieRestController {
	private MovieService movieService;

	@Autowired
	public MovieRestController(MovieService movieService) {
		super();
		this.movieService = movieService;
	}

	@PostMapping("/create")
	public Movie createUser(@RequestBody Movie movie) {
		return movieService.createUser(movie);
	}

	@GetMapping("/all")
	public List<Movie> findAll() {
		return movieService.findAll();
	}

	@GetMapping("/id/{mid}")
	public Optional<Movie> findByMid(@PathVariable String mid) { 
		return movieService.findByMid(mid);
	}
	
	@GetMapping("/name/{name}")
	public Optional<Movie> findByMovieName(@PathVariable String name) { 
		return movieService.findByMovieName(name);
	}
	  
	@DeleteMapping("/deleteall")
	void deleteMovies() {
		movieService.deleteMovies();
	}

}
