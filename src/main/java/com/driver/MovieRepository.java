package com.driver;


import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class MovieRepository {

    Map<String, Movie> movieMap = new TreeMap<>();
    Map<String, Director> directorMap = new TreeMap<>();
    Map<String, List<Movie>> movieDirectorMap = new TreeMap<>();

    public String addMovie(Movie movie){
        String movieName = movie.getName();
        movieMap.put(movieName, movie);
        return "movie "+ movieName +" added successfully";
    }

    public String addDirector(Director director){
        String directorName = director.getName();
        directorMap.put(directorName, director);
        return "director "+ directorName +" added successfully";
    }

    public String addMovieDirectorPair(String movieName, String directorName) throws NullPointerException{

        if(directorMap.containsKey(directorName) == false){
            movieDirectorMap.put(directorName, new ArrayList<Movie>());
        }

        movieDirectorMap.get(directorName).add(getMovieByName(movieName));

        return "movie "+ movieName +" added under the directorName " + directorName;
    }

    public Movie getMovieByName(String movieName) throws NullPointerException{
        return movieMap.get(movieName);
    }

    public Director getDirectorByName(String directorName) throws NullPointerException{
        return directorMap.get(directorName);
    }

    public List<String> getMoviesByDirectorName(String directorName){
        List<String> listOfMovies = new ArrayList<>();
        for(Movie movie: movieDirectorMap.get(directorName)){
            listOfMovies.add(movie.getName());
        }
        return listOfMovies;
    }

    public List<String> findAllMovies(){
        return new ArrayList<>(movieMap.keySet());
    }

    public String deleteDirectorByName(String directorName) throws NullPointerException{
        for(Movie movie: movieDirectorMap.get(directorName)){
            movieMap.remove(movie.getName());
        }
        directorMap.remove(directorName);
        movieDirectorMap.remove(directorName);
        return "movies assigned to " + directorName + " has been deleted";
    }

    public String deleteAllDirectors() throws NullPointerException{

        //or, directly you can do hmap.clear();
        for(String director: directorMap.keySet()){
            for(Movie movie: movieDirectorMap.get(director)){
                movieMap.remove(movie.getName());
            }
            movieDirectorMap.remove(director);
            directorMap.remove(director);
        }

        return "all director and there movies has been deleted";
    }










}
