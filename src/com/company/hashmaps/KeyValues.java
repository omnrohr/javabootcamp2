package com.company.hashmaps;

import java.util.HashMap;

public class KeyValues {
  
    public static void main(String[] args) {
        String[] vegetables = new String[] {"Cauliflower", "Spaghetti Squash", "Parsley"};
        double[] prices = new double[] {4.99, 1.99, 6.99};
        HashMap<String,Double> items = new HashMap<String, Double>();
        for (int i = 0; i < vegetables.length; i++) {
            items.put(vegetables[i],prices[i]);
        }
        items.forEach((key,value)-> System.out.println(key+" : "+ value));
    }
  
}
