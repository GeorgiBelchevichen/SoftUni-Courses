package MethodsLab;

import java.util.Scanner;

public class P05Orders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String command = sc.nextLine();
        int quantity = Integer.parseInt(sc.nextLine());
        switch (command) {
            case "coffee":
                printPriceForCoffee(quantity);
                break;
            case "water":
                printPriceForWater(quantity);
                break;
            case "coke":
                printPriceForCoke(quantity);
                break;

            case "snacks":
                printPriceForSnacks(quantity);
                break;
        }
    }

    public static void printPriceForCoffee(int quantity) {
        double price = 1.5;
        price = quantity * price;
        System.out.printf("%.2f", price);
    }

    public static void printPriceForSnacks(int quantity) {
        double price = 2;
        price = quantity * price;
        System.out.printf("%.2f", price);
    }

    public static void printPriceForCoke(int quantity) {
        double price = 1.4;
        price = quantity * price;
        System.out.printf("%.2f", price);
    }

    public static void printPriceForWater(int quantity) {
        double price = 1;
        price = quantity * price;
        System.out.printf("%.2f", price);
    }
}
