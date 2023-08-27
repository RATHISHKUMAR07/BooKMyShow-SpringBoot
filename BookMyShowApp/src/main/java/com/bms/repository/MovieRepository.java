package com.bms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bms.entity.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer>{
	
	@Query("SELECT m FROM Movie m WHERE m.rating >=:rating")
	List<Movie> getMovieByRating(@Param("rating") int rating);
	
	@Query("SELECT m FROM Movie m WHERE m.genre like %:genre%")
	List<Movie> getMovieByGenre(@Param("genre") String genre);
	
	@Query("SELECT m FROM Movie m WHERE m.cost >= :cost")
	List<Movie> getMovieByCost(@Param("cost") int cost);
}
