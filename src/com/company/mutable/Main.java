package com.company.mutable;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Nissan", 10000); //Mutable or Immutable?
        car.setMake("Honda");
        System.out.println(car);
    }
}

