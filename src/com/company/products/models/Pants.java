package com.company.products.models;

public class Pants extends Product{
    private int waist;

    public Pants(String size, double price, String color, int waist){
        super(size, price, color);
        this.waist = waist;
    }

    public Pants (Pants source){
        super(source);
        this.waist = source.waist;
    }

    public int getWaist() {
        return waist;
    }

    public void setWaist(int waist) {
        this.waist = waist;
    }
}