package com.movieProject;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TestDemo implements MovieInfo {
	
	static Scanner sc=new Scanner(System.in);
	List<Movie> movieList;



	@Override
	public void addMovie() {
        System.out.println("Enter movie details:");
        System.out.print("Movie ID: ");
        int movieId = sc.nextInt();
        System.out.print("Movie Name: ");
        String movieName = sc.next();
        System.out.print("Movie Rating: ");
        String movieRating = sc.next();
        System.out.println("Enter character details:");
        System.out.print("Character ID: ");
        int characterId = sc.nextInt();
        System.out.print("Character Name: ");
        String characterName = sc.next();
        System.out.print("Character Profile: ");
        String profile = sc.next();
        MovieCharacter c = new MovieCharacter(characterId, characterName, profile);
        Movie movie = new Movie(movieId, movieName, movieId, c) ;
        movieList.add(movie);
        System.out.println("Movie added successfully.");
		
	}



	 @Override
	    public void updateMovie() {
	        System.out.print("Enter the movie ID to update: ");
	        int movieId = sc.nextInt();
	        Movie existingMovie = null;
	        for (Movie movie : movieList) {
	            if (movie.getMovieId() == movieId) {
	                existingMovie = movie;
	                break;
	            }
	        }
	        if (existingMovie != null) {
	            System.out.println("Enter new movie details:");
	            System.out.print("Movie Name: ");
	            existingMovie.setMovieName(sc.next());
	            System.out.print("Movie Rating: ");
	            existingMovie.setMovieId(sc.nextInt());
	            System.out.println("Enter new character details:");
	            System.out.print("Character ID: ");
	            int characterId = sc.nextInt();
	            System.out.print("Character Name: ");
	            String characterName = sc.next();
	            System.out.print("Character Profile: ");
	            String profile = sc.next();
	            MovieCharacter character = new MovieCharacter(characterId, characterName, profile);
	            existingMovie.setC(character);
	            System.out.println("Movie updated successfully.");
	        } else {
	            System.out.println("Movie with ID " + movieId + " not found.");
	        }
	    }

	    @Override
	    public void deleteMovie() {
	      
	        System.out.print("Enter the movie ID to delete: ");
	        int movieId = sc.nextInt();
	        for (Movie movie : movieList) {
	            if (movie.getMovieId() == movieId) {
	                movieList.remove(movie);
	                System.out.println("Movie deleted successfully.");
	                return;
	            }
	        }
	        System.out.println("Movie with ID " + movieId + " not found.");
	    }

	    @Override
	    public void searchMovie() {
	       
	        System.out.print("Enter the movie ID to search: ");
	        int movieId = sc.nextInt();
	        for (Movie movie : movieList) {
	            if (movie.getMovieId() == movieId) {
	                System.out.println("Movie details:");
	                System.out.println(movie);
	            }
	        }
	    }


	@Override
	public List<Movie> showMovies() {

		return movieList;
	}



	@Override
	 public List<Movie> sortMovieRating() {
      //  Collections.sort(movieList, (m1, m2) -> m2.getMovieId().compareTo(m1.getMovieId()));
        return movieList;
    }

	public static void main(String[] args) {
		TestDemo t=new TestDemo();
		int choice;
		do {
            System.out.println("\nMenu:");
            System.out.println("1. Add Movie");
            System.out.println("2. Update Movie");
            System.out.println("3. Delete Movie");
            System.out.println("4. Search Movie");
            System.out.println("5. Show All Movies");
            System.out.println("6. Sort Movies by Rating");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    t.addMovie();
                    break;
                case 2:
                   t.updateMovie();
                    break;
                case 3:
                   t.deleteMovie();
                    break;
                case 4:
                    t.searchMovie();
                    break;
                case 5:
                    System.out.println("All Movies:");
                    List<Movie> allMovies = t.showMovies();
                    for (Movie movie : allMovies) {
                        System.out.println(movie);
                    }
                    break;
                case 6:
                    System.out.println("Movies sorted by rating:");
                    List<Movie> sortedMovies = t.sortMovieRating();
                    for (Movie movie : sortedMovies) {
                        System.out.println(movie);
                    }
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 7.");
            }
        } while (choice != 7);
		sc.close();
	}
	
}
