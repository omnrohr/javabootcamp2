package com.company.products.models;

import java.util.Objects;

public class Pants extends Product implements Discountable{
    private String brand;

    public Pants(int size, double price, String color, String waist){
        super(size, price, color);
        this.brand = waist;
    }

    public Pants (Pants source){
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
        return Objects.hash(getColor(), getBrand(),getSize(),getPrice());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null)return false;
        if (!(o instanceof Pants)) return false;
        Pants pants = (Pants) o;
        return (super.getColor().equals(pants.getColor())&&
                super.getPrice() == pants.getPrice() &&
                super.getSize()==(pants.getSize())&&
                this.getBrand() == pants.getBrand());
    }

    @Override
    public String toString() {
        return  "Type: " + this.getClass().getSimpleName()+"\n"+
                "Size: "+ super.getSize() +"\n"+
                "Price: " + super.getPrice() + "\n"+
                "Color: " + super.getColor() + "\n"+
                "Waist: " + this.getBrand() + "\n";
    }

    @Override
    public void fold() {
        System.out.println("fold the pants!");
    }

    @Override
    public void discount() {
        super.setPrice(super.getPrice()/2);
    }


}