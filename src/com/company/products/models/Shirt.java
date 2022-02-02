package com.company.products.models;

public class Shirt extends Product{
    private String brand;

    public Shirt(String size, double price, String color, String brand){
        super(size,price,color);
        this.brand = brand;
    }

    public Shirt(Shirt source){
        super(source);
        this.brand = source.brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}