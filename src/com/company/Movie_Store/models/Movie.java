package com.company.Movie_Store.models;

public class Movie {
    private String name;
    private String format;
    private double rating;
    private double sellingPrice;
    private double rentalPrice;
    private boolean isAvailable;

    public Movie(String name, String format, double rating) {
        if (checkInputs(name)||checkInputs(format)||checkInputs(rating)){
            throw new IllegalArgumentException("\nnone of requested info can be empty or less than 3 characters or negative number\n");
        }
        this.name = name;
        this.format = format;
        this.rating = rating;
        this.sellingPrice = format.equals("Blue-Ray")? 4.25:2.25;
        this.rentalPrice = format.equals("Blue-Ray")? 1.99:0.99;
        this.isAvailable = true;
    }

    public Movie(Movie source){
        this.name = source.name;
        this.format = source.format;
        this.rating = source.rating;
        this.sellingPrice = source.sellingPrice;
        this.rentalPrice = source.rentalPrice;
        this.isAvailable = source.isAvailable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(checkInputs(name)){
            throw new IllegalArgumentException("Name can not be null/blank or less than 3 characters.");
        }else {
        this.name = name;
        }
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        if (checkInputs(format)||(!format.equalsIgnoreCase("Blue-Ray")&&!format.equalsIgnoreCase("DVD"))){
            throw new IllegalArgumentException("Format can not be null/blank or less than 3 characters.");
        }else{
        this.format = format;
        setSellingPrice();
        setRentalPrice();
        }
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        if (checkInputs(rating)){
            throw new IllegalArgumentException("Rating can not be null/blank or less than 0 or grater than 10.");
        }else {
        this.rating = rating;
        }
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    private void setSellingPrice() {
        this.sellingPrice = this.format.equals("Blue-Ray") ? 4.25:2.25;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    private void setRentalPrice() {
        this.rentalPrice = this.format.equals("Blue-Ray") ? 1.99:0.99;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String toString(){
        return "\t Name: " + name + "\n" +
               "\t Format: " + format + "\n" +
               "\t Rating: " + rating + "\n" +
               "\t Selling Price: " + sellingPrice + "\n" +
               "\t Rental Price: " + rentalPrice + "\n" +
               "\t Availability: " + (isAvailable ? "in-stock" : "rented") + "\n";
    }

    private boolean checkInputs(String text){
        return (text.isBlank()||text==null||text.length()<3);
    }
    private boolean checkInputs(double number){
        return (number<=0||number>10);
    }

}
