package com.movieProject;

public class Movie {

	private int movieId;
	private String movieName;
	private double movieRating;
	private MovieCharacter c;
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Movie(int movieId, String movieName, double movieRating, MovieCharacter c) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieRating = movieRating;
		this.c = c;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public double getMovieRating() {
		return movieRating;
	}
	public void setMovieRating(double movieRating) {
		this.movieRating = movieRating;
	}
	public MovieCharacter getC() {
		return c;
	}
	public void setC(MovieCharacter c) {
		this.c = c;
	}
	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", movieRating=" + movieRating + ", c=" + c
				+ "]";
	}
	
	
}
