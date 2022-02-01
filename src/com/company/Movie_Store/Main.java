package com.company.Movie_Store;

import com.company.Movie_Store.models.Movie;
import com.company.Movie_Store.models.Store;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Store store = new Store();
    public static void main(String[] args) {
        System.out.println("\n********************JAVA VIDEO STORE********************\n");
        try {
            loadMovies("D:\\javabootcamp2\\exceptions\\src\\com\\company\\Movie_Store\\movies.txt");
            manageMovies();
//            store.addMovie(new Movie("movie1", "none",8.9));
//            store.addMovie(new Movie("Blue-Ray", "Blue-Ray",9.9));
//            System.out.println(store);
//            store.action("movie1", "rent");
//            System.out.println(store);
//            store.action("blue-ray", "sell");
//            System.out.println(store);
//            store.action("movie1", "return");
//            System.out.println(store);

//            Movie movie1 = new Movie("movie1", "none",8.9);
//            Movie movie2 = new Movie("Blue-Ray", "Blue-Ray",9.9);
//            System.out.println(movie2);
//            movie2.setFormat("Blue-Ray");
//            System.out.println(movie2);
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Movies Loaded.\n\n"+ store);

        }
    }

    /**
     * Name: manageMovies
     * Inside the function:
     *   • 1. Starts a new instance of Scanner;
     *   • 2. In an infinite loop, the user can choose to a) purchase b) rent c) return d) exit.
     *   •        case a: ask for the name and sell.
     *   •        case b: ask for the name and rent.
     *   •        case c: ask for the name and return.
     *   • 3. call close() from the Scanner object.
     */
    public static void manageMovies(){
        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.println("Please select one of following.\n\ta) to purchase movie.\n\tb) to rent movie.\n\tc) to return.\n\td) to add movie.\n\te) to exit.");
            System.out.print("Please enter your choice: ");
            String response = scan.nextLine();

            if (response.equalsIgnoreCase("e"))break;

            switch (response){
                case "a":{
                    System.out.print("\nWhat would you like to purchase: ");
                    String name = scan.nextLine();
                    store.action(name, "sell");
                    break;
                }
                case "d": {
                    System.out.print("please enter the movie name: ");
                    String name = scan.nextLine();

                    System.out.print("please enter the movie format: ");
                    String format = scan.nextLine();

                    System.out.print("Please enter rating: ");
                    double rating = scan.nextDouble();

                    if (name.isBlank()||format.isBlank()||rating<0||rating>10||
                            name==null||format.length()<3||format==null ||
                            (!format.equalsIgnoreCase("dvd")&&!format.equalsIgnoreCase("Blue-Ray"))){
                        System.out.println("\nnone of requested info can be empty or phone number is less than 9 characters\n");
                        continue;
                    }else {
                        try {
                            store.addMovie(new Movie(name,format,rating));
                        }catch (IllegalArgumentException e){
                            System.out.println(e.getMessage());
                        }finally {
                            System.out.println("\nContact added successfully.\n");
                            System.out.println(store.searchMovie(name));
                            break;
                        }
                    }
                }
                case "b":{
                    System.out.print("\nWhat would you like to rent? ");
                    String name = scan.nextLine();
                    store.action(name, "rent");
                    break;
                }
                case "c":{
                    System.out.print("\nwho would you like to return? ");
                    String name = scan.nextLine();
                    store.action(name, "return");
                    break;
                }
            }
        }scan.close();
    }

    /**
     * Name: loadMovies
     * @param fileName (String)
     * @throws FileNotFoundException
     *
     * Inside the function:
     *   • 1. loads movies from <fileName>.txt.
     *   • 2. adds all movies to the store object's movie field.
     *        Hint: You will need to 'split' a String into three Strings.
     */
    public static void loadMovies(String fileName) throws FileNotFoundException{
        FileInputStream load = new FileInputStream(fileName);
        Scanner scan = new Scanner(load);
        while (scan.hasNextLine()){
            String temp = scan.nextLine();
            String[] movieLine = temp.split("--");
            store.addMovie(new Movie(movieLine[0], movieLine[1],Double.parseDouble(movieLine[2])));
        }
    }
}