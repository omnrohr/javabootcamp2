package com.company.products.models;

public class Product {
    private String size;
    private double price;
    private String color;

    public Product(String size, double price, String color){
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public Product(Product source){
        this.size = source.size;
        this.price = source.price;
        this.color = source.color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
