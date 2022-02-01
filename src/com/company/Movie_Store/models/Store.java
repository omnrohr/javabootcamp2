package com.company.Movie_Store.models;

import java.util.ArrayList;

public class Store {
    private ArrayList<Movie> movies;

    public Store(){
        this.movies = new ArrayList<Movie>();
    }

    public Movie getMovie(int index){
        return new Movie(movies.get(index));
    }
    public void addMovie(Movie movie){
        movies.add(new Movie(movie));
    }

    public void setMovies(int index, Movie movie){
        movies.set(index,new Movie(movie));
    }

    public void action (String name, String action){
        if (checkInput(name)){
            throw new IllegalArgumentException("name should be more than 3 characters.");
        }
        if (movies.size()==0){
            throw new IllegalStateException("sorry no movies.");
        }
        for (int i = 0; i < movies.size(); i++) {
            if (movies.get(i).getName().equalsIgnoreCase(name)){

                if (action.equalsIgnoreCase("sell")&& movies.get(i).isAvailable()){
                    movies.remove(i);
                    System.out.println("Enjoy your movie.");

                }else if (action.equalsIgnoreCase("rent")&& movies.get(i).isAvailable()){
                    movies.get(i).setAvailable(false);
                    System.out.println("Enjoy your movie.");

                } else if (action.equalsIgnoreCase("return")&& !movies.get(i).isAvailable()){
                    movies.get(i).setAvailable(true);
                    System.out.println("Thanks for return the movie.");
                }else continue;
                break;
            }
        }
    }

//    public void sellMovie(String name){
//        for (int i = 0; i < movies.size(); i++) {
//            if (movies.get(i).getName().equalsIgnoreCase(name)){
//                movies.remove(i);
//                System.out.println("Enjoy your movie.");
//                break;
//            }
//        }
//    }
//
//    public void rentMovie(String name){
//        for (int i = 0; i < movies.size(); i++) {
//            if (movies.get(i).getName().equalsIgnoreCase(name)){
//                movies.get(i).setAvailable(false);
//                System.out.println("Enjoy your movie.");
//                break;
//            }
//        }
//    }
//
//    public void returnMovie(String name){
//        for (int i = 0; i < movies.size(); i++) {
//            if (movies.get(i).getName().equalsIgnoreCase(name)){
//                movies.get(i).setAvailable(true);
//                System.out.println("Thanks for return the movie.");
//                break;
//            }
//        }
//    }
    public String toString(){
        String temp = "";
        if (movies.size()==0){
            return "Sorry no movies";
        }else {
            for (int i = 0; i < movies.size(); i++) {
                temp += movies.get(i).toString()+"\n\n";
            }
        }return temp;
    }

    private boolean checkInput(String input){
        return (input.isBlank()||input==null);
    }
    private boolean checkInput(double number){
        return (number<=0||number>10);
    }
    public String searchMovie(String name){
        if (movies.isEmpty()){
            throw new IllegalStateException("contacts is empty.");
        }
        for (int i = 0; i < movies.size(); i++) {
            if (movies.get(i).getName().equalsIgnoreCase(name))
                return movies.get(i).toString();
        }return null;
    }
}
