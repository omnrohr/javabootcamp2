package com.company.products.models;

public abstract class Product implements Comparable<Product>{
//    public enum Size {
//        SMALL, MEDIUM, LARGE
//    }
    private int size;
    private double price;
    private String color;

    public Product(int size, double price, String color){
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public Product(Product source){
        this.size = source.size;
        this.price = source.price;
        this.color = source.color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
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

    public abstract void fold();

    @Override
    public int compareTo(Product specifiedObject) {
        return (int) Math.round(this.getPrice() - specifiedObject.getPrice());
    }
}
