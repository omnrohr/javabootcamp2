package com.company.products.models;

import java.util.Objects;

public class Shirt extends Product{
    private String brand;

    public Shirt(int size, double price, String color, String brand){
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

    @Override
    public int hashCode() {
        return Objects.hash(getColor(),getBrand(),getSize(), getPrice());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null)return false;
        if (!(o instanceof Shirt)) return false;
        Shirt shirt = (Shirt) o;
        return (
                getColor().equals(shirt.getColor())
                && getPrice()==shirt.getPrice()
                && getSize()==(shirt.getSize())
                && getBrand().equals(shirt.getBrand())
        );
    }

    @Override
    public String toString() {
        return  "Size: "+ super.getSize() +"\n"+
                "Price: " + super.getPrice() + "\n"+
                "Color: " + super.getColor() + "\n"+
                "Brand: " + this.getBrand() + "\n";
    }

    @Override
    public void fold() {
        System.out.println("Fold the shirt!");
    }
}