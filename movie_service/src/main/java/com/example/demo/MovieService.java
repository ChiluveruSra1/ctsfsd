package com.example.demo;

import java.util.List;
import java.util.Optional;

public interface MovieService {

	public Movie createUser(Movie movie);

	List<Movie> findAll();

	public Optional<Movie> findByMid(String mid);

	public void deleteMovies();

	public Optional<Movie> findByMovieName(String name);

}
