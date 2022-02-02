package com.company.hashcodeEquals;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Car nissan = new Car("nissan", 2018);
        System.out.println("nissan    " + nissan.hashCode());

        Car toyota = new Car("toyota", 2018);
        System.out.println("toyota    " + toyota.hashCode());

        Car anycar = new Car(nissan);
        System.out.println("any car   " + anycar.hashCode());

        Car nissan2 = new Car(nissan);
        System.out.println("nissan2   " + nissan2.hashCode());

        HashMap<Car, Integer> prices = new HashMap<Car, Integer>();
        prices.put(nissan,10000);
        prices.put(toyota,2000);
        prices.put(anycar, 300000);

        System.out.println(nissan2.equals(nissan));
        System.out.println(prices.get(nissan2));

    }
}
