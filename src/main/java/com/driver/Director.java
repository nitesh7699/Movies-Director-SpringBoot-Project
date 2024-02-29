package com.driver;

public class Director {

    //properties of a Director object
    private String directorName;
    private int numberOfMovies;
    private double imdbRating;

    public Director(){

    }

    public Director(String directorName, int numberOfMovies, double imdbRating) {
        this.directorName = directorName;
        this.numberOfMovies = numberOfMovies;
        this.imdbRating = imdbRating;
    }

    public String getName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public int getNumberOfMovies() {
        return numberOfMovies;
    }

    public void setNumberOfMovies(int numberOfMovies) {
        this.numberOfMovies = numberOfMovies;
    }

    public double getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(double imdbRating) {
        this.imdbRating = imdbRating;
    }
}
