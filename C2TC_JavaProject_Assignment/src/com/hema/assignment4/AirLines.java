package com.hema.assignment4;

import java.util.Scanner;

public class AirLines {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();
        int hours = sc.nextInt();
        double costPerHour = sc.nextDouble();

        Airfare airfare;

        switch (choice) {
            case 1:
                airfare = new AirIndia(hours, costPerHour);
                break;
            case 2:
                airfare = new KingFisher(hours, costPerHour);
                break;
            case 3:
                airfare = new Indigo(hours, costPerHour);
                break;
            default:
                System.out.println("Invalid Choice");
                sc.close();
                return;
        }

        airfare.display();
        sc.close();
    }
}