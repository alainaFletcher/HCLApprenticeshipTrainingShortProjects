package com.hcl.collections;

public class Movie {
	double rating;
    String name;
    int year;
 
    public Movie(double r, String n, int y){
    this.rating = r;
    this.name = n;
        this.year = y;
    }

public double getRating(){
    return rating;
    }
    public String getName(){  
    return name;
    }
    public int getYear(){
    return year;  
    }
   
    public int compareTo(Movie m)
    {
        return this.year - m.year;
    }
   
    public String outputString() {
    return "Movie: " + name + "\n   Year: " + year + "\n   Rating: " + rating + "\n";
    }



}
