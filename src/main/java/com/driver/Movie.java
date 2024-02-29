package com.driver;

public class Movie {

    //properties of a Movie object
    private String movieName;
    private double imdbRating;
    private int durationInMinutes;

    public Movie(){

    }

    public Movie(String movieName, double imdbRating, int durationInMinutes) {
        this.movieName = movieName;
        this.imdbRating = imdbRating;
        this.durationInMinutes = durationInMinutes;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public double getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(double imdbRating) {
        this.imdbRating = imdbRating;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }


}
