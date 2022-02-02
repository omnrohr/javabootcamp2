package com.company.products;

import com.company.products.models.Pants;
import com.company.products.models.Product;
import com.company.products.models.Shirt;

import java.util.Arrays;

public class Main {
  
    static final String FILE_NAME = "D:\\javabootcamp2\\exceptions\\src\\com\\company\\products\\products.txt";

    public static void main(String[] args) {
        Product[] products = new Product[] {
                new Pants(32, 24.99, "Blue", "JAVA KLEIN"),
                new Shirt(25, 22.99, "Black", "CHANEL"),
                new Pants(34, 104.99, "Red", "JANGLER"),
                new Shirt(17, 13.99, "Orange", "GEORGE"),
                new Pants(30, 119.99, "Grey", "FENDI"),
                new Shirt(35, 34.99, "Blue", "ECKO"),
                new Pants(30, 129.99, "Red", "VERSACE"),
                new Shirt(27, 22.99, "Beige", "ZARA"),
                new Pants(29, 99.99, "Dark", "JANGLER"),
                new Shirt(19, 19.99, "Red", "NIKE"),
                new Pants(26, 24.99, "Indigo", "BELSTAFF"),
                new Shirt(22, 29.99, "Blue", "ADIDAS"),
                new Pants(34, 104.99, "Red", "JANGLER"),
        };
        Arrays.sort(products);
        printArray(products);

    }

    public static void printArray(Product[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
  
    /**
     * Function Name: getData
     * @return Product[]
     * @throws FileNotFoundException
     * 
     * Inside the function:
     *   1. Loads the data from products.txt
     */
}
