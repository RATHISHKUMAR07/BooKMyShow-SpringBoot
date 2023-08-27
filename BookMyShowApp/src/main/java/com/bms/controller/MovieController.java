package com.bms.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.bms.service.*;
import com.bms.entity.*;

@RestController
public class MovieController {
	
	@Autowired
	private IMovieService movieService;
	
	@GetMapping("/BookMyShow/movies")
	public List<Movie> getAllMovies() {
		return movieService.getAllMovies();
	}
	
	@GetMapping("/BookMyShow/movies/{id}")
	public Optional<Movie> getMovieById(@PathVariable("id") int id) {
		return movieService.getMovieById(id);
	}
	
//	@PostMapping("/BookMyShow/movies")
//	public void addMovie(@RequestBody Movie movie) {
//		movieService.addMovie(movie);
//	}
	
	@PostMapping("/BookMyShow/movies")
	public ResponseEntity<String> addMovies(@RequestBody List<Movie> movies) {
		movieService.addMovies(movies);
	    return ResponseEntity.ok("Movie added successfully");

	}
	
	@PutMapping("/BookMyShow/movies/{id}")
	public ResponseEntity<String> updateMovie(@PathVariable int id,@RequestBody Movie movie) {
		movieService.updateMovie(id,movie);
	    return ResponseEntity.ok("Movie updated successfully");

	}
	
	@DeleteMapping("/BookMyShow/movies/{id}")
	public ResponseEntity<String> deleteMovie(@PathVariable int id) {
		movieService.deleteMovie(id);
	    return ResponseEntity.ok("Movie deleted successfully");

	}
	
	@GetMapping("/BookMyShow/movies/rating/{rating}")
	public List<Movie> getMovieByRating(@PathVariable int rating){
		return movieService.getMovieByRating(rating);
	}
	
	@GetMapping("/BookMyShow/movies/genre/{genre}")
	public List<Movie> getMovieByRating(@PathVariable String genre){
		return movieService.getMovieByGenre(genre);
	}
	
	@GetMapping("/BookMyShow/movies/cost/{cost}")
	public List<Movie> getMovieByCost(@PathVariable int cost){
		return movieService.getMovieByCost(cost);
	}

}
