package com.onesoft.fifteen.stream;

public class Movie {


	
private String movieName;
private int year;
private String actor;
private double rating;
public Movie(String movieName, int year, String actor, double d) {
	
	this.movieName = movieName;
	this.year = year;
	this.actor = actor;
	this.rating = d;
}
public String getMovieName() {
	return movieName;
}
public void setMovieName(String movieName) {
	this.movieName = movieName;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public String getActor() {
	return actor;
}
public void setActor(String actor) {
	this.actor = actor;
}
public double getRating() {
	return rating;
}
public void setRating(double rating) {
	this.rating = rating;
}
@Override
public String toString() {
	return "movieName=" + movieName + ", year=" + year + ", actor=" + actor + ", rating=" + rating ;
}		


	}



	
