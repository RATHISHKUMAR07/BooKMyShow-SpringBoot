package com.bms.service;

import java.util.List;
import java.util.Optional;

import com.bms.entity.Movie;

public interface IMovieService {
	
	List<Movie> getAllMovies();
	
	Optional<Movie> getMovieById(int id);
	
	//void addMovie(Movie movie);
	
	void updateMovie(int id,Movie movie);
	
	void deleteMovie(int id);
	
	List<Movie> getMovieByRating(int rating);
	
	List<Movie> getMovieByGenre(String genre);
	
	List<Movie> getMovieByCost(int cost);

	void addMovies(List<Movie> movies);
}
