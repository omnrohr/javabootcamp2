package com.company.arraylist;

import java.util.ArrayList;

public class ResizableArrays {
    public static void main(String[] args) {
        ArrayList<String> myArray = new ArrayList<>();
        myArray.add("item1");
        myArray.add("item2");
        myArray.add("item3");
        myArray.set(2,"modified item");
        for (int i = 0; i < myArray.size(); i++) {
            System.out.println(myArray.get(i));
        }
        ArrayList<String> newArray = new ArrayList(myArray);

    }
}
