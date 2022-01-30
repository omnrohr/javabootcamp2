package com.company.dealership;

import java.util.Scanner;

import com.company.dealership.models.Car;
import com.company.dealership.models.Dealership;


public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Car[] cars = new Car[] {
                new Car("Nissan", 5000),
                new Car("Honda", 12000),
        };
        cars[1].setMake("Toyota");
        cars[1].setPrice(8500);

        Dealership dealership = new Dealership(cars);

        System.out.println("\n************* JAVA DEALERSHIP *************");
        while (true) {
            if (dealership.isEmpty()){
                System.out.println("sorry no cars to sell!");
                break;
            }
            System.out.println(dealership);
            System.out.print("Enter the spot number of the car you want to buy: ");
            if (!scan.hasNextInt()){
                scan.nextLine();
                System.out.println("INVALID INPUT.");
                continue;
            }
            int spot = scan.nextInt();
            scan.nextLine();
            if (spot< 0||spot> dealership.getLength()-1){
                System.out.println("INVALID INPUT!");
                continue;
            }else if (dealership.getCar(spot)==null){
                System.out.println("Sorry this car has sold out!\nTry another car in list.");
                continue;
            }
            System.out.println(cars[spot]);
            dealership.sell(spot);
        }

        //scan.close();

    }
}
