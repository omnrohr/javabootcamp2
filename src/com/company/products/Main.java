package com.company.products;

import com.company.products.models.Pants;
import com.company.products.models.Product;
import com.company.products.models.Shirt;

public class Main {
  
    static final String FILE_NAME = "products.txt";

    public static void main(String[] args) {
        Shirt shirt1 = new Shirt(Product.Size.LARGE, 1.2,"blue", "omn");
        Pants pants1 = new Pants(Product.Size.MEDIUM, 2.3, "blue", 1);
//        Product product = new Product("helo", 2, "hi"); // you can not instantiate an abstract class.
        Shirt shirt2 = shirt1;
        boolean result = shirt2.equals(shirt1);
        System.out.println(shirt1);
        System.out.println(pants1);
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
