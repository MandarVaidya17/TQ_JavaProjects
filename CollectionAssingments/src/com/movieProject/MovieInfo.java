package com.movieProject;

import java.util.List;

public interface MovieInfo {

	 	void addMovie();
	    void updateMovie();
	    void deleteMovie();
	    void searchMovie();
	    List<Movie> showMovies();
	    List<Movie> sortMovieRating();
	
	
}
