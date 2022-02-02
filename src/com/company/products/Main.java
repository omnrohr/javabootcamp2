package com.company.products;

import com.company.products.models.Pants;
import com.company.products.models.Product;
import com.company.products.models.Shirt;

public class Main {
  
    static final String FILE_NAME = "D:\\javabootcamp2\\exceptions\\src\\com\\company\\products\\products.txt";

    public static void main(String[] args) {
        Product[] products = new Product[] {
                new Pants(32, 24.99, "Blue", "JAVA KLEIN"),
                new Pants(34, 104.99, "Red", "JANGLER"),
                new Pants(30, 119.99, "Grey", "FENDI"),
                new Pants(30, 129.99, "Red", "VERSACE"),
                new Pants(29, 99.99, "Dark", "JANGLER"),
                new Pants(26, 24.99, "Indigo", "BELSTAFF"),
                new Pants(34, 104.99, "Red", "JANGLER"),
        };

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
