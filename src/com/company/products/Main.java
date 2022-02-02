package com.company.products;

import com.company.products.models.Pants;
import com.company.products.models.Shirt;

public class Main {
  
    static final String FILE_NAME = "products.txt";

    public static void main(String[] args) {
        Shirt shirt1 = new Shirt("L", 1.2,"blue", "omn");
        Pants pants1 = new Pants("M", 2.3, "blue", 1);

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
