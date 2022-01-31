package com.company.vendingmachine;
import com.company.vendingmachine.models.Item;
import com.company.vendingmachine.models.Machine;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("\t************************************************");
        System.out.println("\t             WELCOME TO JAVA DRINKS!            ");
        System.out.println("\t************************************************");

        Item[][] items = new Item[][] {
                { new Item("Pepsi", 1.99, 3) , new Item("Fresca", 1.49, 3), new Item("Brisk", 2.49, 2) },
                { new Item("Fanta", 1.99, 2) , new Item("Barq's", 1.49, 2), new Item("A & W", 2.49, 3) },
                { new Item("Crush", 1.99, 2) , new Item("C-Cola", 1.49, 2), new Item("Berry", 2.49, 1) }
        };

        Machine machine = new Machine(items);

        System.out.println(machine);

        while (true) {
            System.out.print("Pick a row: ");
            if (!scan.hasNextInt()){
                scan.nextLine();
                System.out.println("INVALID INPUT!");
                continue;
            }
            int row = scan.nextInt();
            System.out.print("Pick a spot in the row: ");
            if (!scan.hasNextInt()){
                scan.nextLine();
                System.out.println("INVALID INPUT!");
                continue;
            }
            int spot = scan.nextInt();
            if (spot < 0 || spot>machine.getLength()[1]-1 || row < 0 || row > machine.getLength()[0]){
                System.out.println("INVALID SPOT/ROW!");
                continue;
            }
            scan.nextLine();
            if (machine.getItem(row,spot).getQuantity()==0){
                System.out.println("This item is empty, please select another item.");
                continue;
            }
            machine.dispense(row, spot);
            System.out.println("\n" + machine);
            System.out.print("\nEnjoy your drink! Press 1 to purchase another: ");
            if (!scan.next().equalsIgnoreCase("1")) {
                break;
            }
        }
        scan.close();
    }
}
