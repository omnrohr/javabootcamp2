package com.company.products.models;

import java.util.Objects;

public class Pants extends Product implements Discountable{
    private int waist;

    public Pants(Size size, double price, String color, int waist){
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

    @Override
    public int hashCode() {
        return Objects.hash(getColor(),getWaist(),getSize(),getPrice());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null)return false;
        if (!(o instanceof Pants)) return false;
        Pants pants = (Pants) o;
        return (super.getColor().equals(pants.getColor())&&
                super.getPrice() == pants.getPrice() &&
                super.getSize().equals(pants.getSize())&&
                this.getWaist() == pants.getWaist());
    }

    @Override
    public String toString() {
        return  "Size: "+ super.getSize() +"\n"+
                "Price: " + super.getPrice() + "\n"+
                "Color: " + super.getColor() + "\n"+
                "Waist: " + this.getWaist() + "\n";
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