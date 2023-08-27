package com.bms.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name="Movies")
public class Movie {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	@NotEmpty
	@Pattern(regexp = "^[A-Za-z ]+$", message="Enter movie name using alphabets")
	@Column(name="name")
	private String name;
	@NotEmpty
	@Column(name="description")
	private String description;
	@NotNull
	@Min(value = 1, message = "Rating must be at least 1")
    @Max(value = 10, message = "Rating must be at most 10")
	@Column(name="rating")
	private int rating;
	@NotEmpty
	@Pattern(regexp = "^[A-Za-z]+$", message="Enter genre name using alphabets")
	@Column(name="genre")
	private String genre;
	@NotNull
	@Column(name="cost")
	private int cost;
	
	public Movie() {
		
	}
	
	public Movie(
			int id,
			@NotEmpty
			@Pattern(regexp = "^[A-Za-z ]+$", message="Enter movie name using alphabets") 
			String name , 
			@NotEmpty 
			String description,
			@NotNull
			@Min(value = 1, message = "Rating must be at least 1")
		    @Max(value = 10, message = "Rating must be at most 10")
			int rating,
		    @NotEmpty
			@Pattern(regexp = "^[A-Za-z]+$", message="Enter genre name using alphabets") 
			String genre,
			@NotNull
			int cost
			) 
	{
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.rating = rating;
		this.genre = genre;
		this.cost = cost;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", description=" + description + ", rating=" + rating + ", genre="
				+ genre + ", cost=" + cost + "]";
	}

	
	
	
}
