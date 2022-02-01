package com.company.ShoppingCart.models;

import java.util.ArrayList;

public class Store {
    private Item[][] storeItems;

    public Store(){
        this.storeItems = new Item[7][3];
    }

    public Store(Item[][] items){
        this.storeItems = new Item[items.length][items[0].length];
        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items[0].length; j++) {
                storeItems[i][j] = new Item(items[i][j]);
            }
        }
    }
    public Item getItem(int row, int column){
        return storeItems[row][column];
    }

    public void setItem (int row, int column, Item item){
        storeItems[row][column] = new Item(item);
    }

    public String toString(){
        String temp = "";
        for (int i = 0; i < storeItems.length; i++) {
            switch (i) {
                case 0: temp += "\tDRINKS:        "; break;
                case 1: temp += "\tCEREAL:        "; break;
                case 2: temp += "\tDAIRY:         "; break;
                case 3: temp += "\tDELI:          "; break;
                case 4: temp += "\tGREENS:        "; break;
                case 5: temp += "\tCLOTHING:      "; break;
                case 6: temp += "\tELECTRONICS:   "; break;
            }
            for (int j = 0; j < storeItems[i].length; j++) {
                temp += storeItems[i][j].toString() +"  ";

            }temp +="\n\n";
        }return temp;
    }
}
