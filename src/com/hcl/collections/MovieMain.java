package com.hcl.collections;
import java.util.ArrayList;
import java.util.Collections;

/*
 * Consider a Movie class that has members like, rating, name, year.
 * Suppose we wish to sort a list of Movies based on year of release,
 * also we want to sort movies by their rating and names as well,Write a
 * Java Program to implement this functionality,kindly use all the proper
 * required Java coding conventions
 */

public class MovieMain {

public static void main(String[] args)
    {
        ArrayList<Movie> list = new ArrayList<Movie>();
       
        list.add(new Movie(8.3, "Force Awakens", 2015));
        list.add(new Movie(8.7, "Star Wars", 1977));
        list.add(new Movie(8.8, "Empire Strikes Back", 1980));
        list.add(new Movie(8.4, "Return of the Jedi", 1983));
 
        //Collections.sort((List<Movie>) list);
 
        System.out.println("Movies after sorting by year: ");
        for (Movie movie: list)
        {
            System.out.println(movie.outputString());
        }
       
        System.out.println("\nMovies after sorting by rating");
        RatingCompare ratingCompare = new RatingCompare();
        Collections.sort(list, ratingCompare);
        for (Movie movie: list)
        System.out.println(movie.outputString());
 
        System.out.println("\nMovies after sorting by name");
        NameCompare nameCompare = new NameCompare();
        Collections.sort(list, nameCompare);
        for (Movie movie: list)
        System.out.println(movie.outputString());
    }

}