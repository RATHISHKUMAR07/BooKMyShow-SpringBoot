package com.bms.service;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bms.entity.Movie;
import com.bms.repository.MovieRepository;

@Service
public class MovieService implements IMovieService{
	
	@Autowired
	private MovieRepository movieRepository;
	
	public List<Movie> getAllMovies(){
		List<Movie> aList = new ArrayList<>();
		movieRepository.findAll()
		.forEach(aList::add);
		
		return aList;
	}
	
	public Optional<Movie> getMovieById(int id) {
		return movieRepository.findById(id);
	}
	
//	public void addMovie(Movie movie) {
//		movieRepository.save(movie);
//	}
	
	@Override
	public void addMovies(List<Movie> movies) {
		movieRepository.saveAll(movies);
		
	}

	public void updateMovie(int id, Movie updatedMovie) {
	    // Find the existing movie by ID
	    Optional<Movie> optionalMovie = movieRepository.findById(id);

	    // Check if the movie exists
	    if (optionalMovie.isPresent()) {
	        Movie existingMovie = optionalMovie.get();

	        // Update the fields of the existing movie with the data from the updatedMovie
	        existingMovie.setName(updatedMovie.getName());
	        existingMovie.setDescription(updatedMovie.getDescription());
	        existingMovie.setRating(updatedMovie.getRating());
	        existingMovie.setGenre(updatedMovie.getGenre());
	        existingMovie.setCost(updatedMovie.getCost());

	        // Save the updated movie back to the repository
	        movieRepository.save(existingMovie);
	    } 
	}

//	public void updateMovie(int id,Movie movie) {
//		movieRepository.findById(id);
//	}
//	
	public void deleteMovie(int id) {
		movieRepository.deleteById(id);
	}

	@Override
	public List<Movie> getMovieByRating(int rating) {
		return movieRepository.getMovieByRating(rating);
	}

	@Override
	public List<Movie> getMovieByGenre(String genre) {
		return movieRepository.getMovieByGenre(genre);
	}

	@Override
	public List<Movie> getMovieByCost(int cost) {
		return movieRepository.getMovieByCost(cost);
	}

	

}
