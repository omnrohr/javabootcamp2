package com.company.ShoppingCart.models;

import java.util.ArrayList;

public class Cart {
    private ArrayList<Item> items;

    public Cart() {
        this.items = new ArrayList<Item>();
    }

    public Item getItem(int index){
        return new Item(items.get(index));
    }

    public void setItem(int index, Item item){
        this.items.set(index, new Item(item));
    }


    /**
     * Name: add
     * @param item
     * @return boolean
     *
     * Inside the function:
     *   1. Adds an item to the cart if it wasn't already added.
     */
    public boolean add(Item item){
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getName().equals(item.getName())){
                System.out.println("item can not be duplicated!");
                return false;
            }
        }items.add(new Item(item));
        return true;
    }


    /**
     * Name: remove
     * @param name
     * @return boolean.
     *
     * Inside the function:
     *   1. Removes the item that matches the name passed in.
     */
    public boolean remove(String name){
        if (items.size() == 0 || items.isEmpty()) {
            throw new IllegalStateException("Cart is empty!");
        }
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getName().equalsIgnoreCase(name)){
                return items.remove(items.get(i));
            }
        }return false;
    }



    /**
     *  Name: checkout
     *  @return (String)
     *
     *  Inside the function:
     *   1. Calculates the subtotal (price before tax).
     *   2. Calculates the tax (assume tax is 13%).
     *   3. Calculates total: subtotal + tax
     *   4. Returns a String that resembles a receipt. See below.
     */
    public String checkout(){
        if (items.size()==0|| items.isEmpty()){
            throw new IllegalStateException("Cart is Empty!");
        }
        double subtotal= 0;
        for (int i = 0; i < items.size(); i++) {
            subtotal+= items.get(i).getPrice();
        }double tax = subtotal * 0.13;
        return   "\tRECEIPT\n\n" +
                "\tSubtotal: $" + subtotal + "\n" +
                "\tTax: $" + tax + "\n" +
                "\tTotal: $" + (subtotal+tax) + "\n";
    }

    @Override
    public String toString() {
        String temp = "";
        for (int i = 0; i < items.size() ; i++) {
            temp += (items.get(i).toString() + "\n");
        }
        return temp;
    }
}

