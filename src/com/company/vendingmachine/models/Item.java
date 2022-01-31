package com.company.vendingmachine.models;
public class Item {
    private String name;
    private double price;
    private int quantity;

    public Item(String name, double price, int quantity) {
        if (name == null || name.isBlank())
            throw new IllegalArgumentException("Name can not be null\\blank!");
        else this.name = name;
        if (price<0)
            throw new IllegalArgumentException("Price can not be less than 0!");
        else this.price = price;
        if (quantity < 0)
            throw new IllegalArgumentException("Quantity can not be les than 0!");
        else this.quantity = quantity;
    }
    public Item(Item source) {
        this.name = source.name;
        this.price = source.price;
        this.quantity = source.quantity;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setName(String name) {
        if (name.isBlank()||name==null)
            throw new IllegalArgumentException("name cannot be null/blank.");
        else this.name = name;
    }
    public void setPrice(double price) {
        if (price<0)
            throw new IllegalArgumentException("price cannot be less than zero.");
        else this.price = price;
    }
    public void setQuantity(int quantity) {
        if (quantity < 0)
            throw new IllegalArgumentException("quantity cannot be less than zero.");
        else this.quantity = quantity;
    }

    public String toString() {
        return this.name + ": " + this.price + " ("+this.quantity+")";
    }

}

