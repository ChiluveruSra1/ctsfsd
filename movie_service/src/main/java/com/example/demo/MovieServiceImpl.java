package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MovieServiceImpl implements MovieService {

	private MovieRepositry movieRepositry;

	@Autowired
	public MovieServiceImpl(MovieRepositry movieRepositry) {
		super();
		this.movieRepositry = movieRepositry;
	}

	@Override
	@Transactional
	public Movie createUser(Movie movie) {
		// TODO Auto-generated method stub
		return movieRepositry.save(movie);
	}

	@Override
	@Transactional
	public List<Movie> findAll() {
		// TODO Auto-generated method stub
		return movieRepositry.findAll();
	}

	@Override
	  @Transactional
	  public Optional<Movie> findByMid(String mid) { 
		return movieRepositry.findById(mid);
	}

	@Override
	@Transactional
	public void deleteMovies() { 
		movieRepositry.deleteAll();
	}

	@Override
	@Transactional
	public Optional<Movie> findByMovieName(String name) {
		// TODO Auto-generated method stub
		return movieRepositry.findByMovieName(name);
	}
	  
	

}
