package com.company.ShoppingCart.models;

public class Item {
    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Item(Item source){
        this.name = source.name;
        this.price = source.price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (checkInputs(name)){
            throw new IllegalArgumentException("Product name can not be null/blank or less than 3 characters.");
        }
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (checkInputs(price)){
            throw new IllegalArgumentException("Product price can not be les than 0 or more than 1000");
        }
        this.price = price;
    }

    public boolean checkInputs(String text){
        return (text.isBlank()|| text.length()<3 || text==null);
    }
    public boolean checkInputs(double number){
        return (number<0|| number>1000);
    }

    @Override
    public String toString() {
        return name + ": $" + price + " ";
    }
}
