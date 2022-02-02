package com.company.products;

import com.company.products.models.Pants;
import com.company.products.models.Product;
import com.company.products.models.Shirt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
  
    static final String FILE_NAME = "D:\\javabootcamp2\\exceptions\\src\\com\\company\\products\\products.txt";

    public static void main(String[] args) {
        try {
        Product[] products = getData();
        Arrays.sort(products);
        printArray(products);
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
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

    public static Product[] getData() throws FileNotFoundException{
        FileInputStream fis = new FileInputStream(FILE_NAME);
        Scanner scan = new Scanner(fis);

        Product[] products = new Product[18];

        for (int i = 0; scan.hasNextLine(); i++) {
            switch (scan.next()) {
                case "SHIRT": products[i] = new Shirt(scan.nextInt(), scan.nextDouble(), scan.next(), scan.next()); break;
                case "PANTS": products[i] = new Pants(scan.nextInt(), scan.nextDouble(), scan.next(), scan.next()); break;
            }
        }
        scan.close();
        return products;
    }
}
