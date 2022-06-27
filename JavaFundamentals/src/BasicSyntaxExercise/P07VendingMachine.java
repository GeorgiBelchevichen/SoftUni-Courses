package BasicSyntaxExercise;

import java.util.Scanner;

public class P07VendingMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double allMoney = 0;
        String command = sc.nextLine();
        while (!command.equals("Start")) {
            double coins = Double.parseDouble(command);
            if (coins == 0.1 || coins == 0.2 || coins == 0.5 || coins == 1 || coins == 2) {
                allMoney += coins;
            } else {
                System.out.printf("Cannot accept %.2f%n", coins);
            }

            command = sc.nextLine();
        }
        boolean isFalse = false;
        double price = 0;
        String productName = sc.nextLine();
        while (!productName.equals("End")) {
            switch (productName) {
                case "Nuts":
                    price = 2.0;
                    break;
                case "Water":
                    price = 0.7;
                    break;
                case "Crisps":
                    price = 1.5;
                    break;
                case "Soda":
                    price = 0.8;
                    break;
                case "Coke":
                    price = 1.0;
                    break;
                default:{
                    System.out.println("Invalid product");
                    isFalse=true;
                    break;}
            }
            if (price <= allMoney && !isFalse) {
                System.out.printf("Purchased %s%n", productName);
                allMoney -= price;

            } else if (price > allMoney) {
                System.out.println("Sorry, not enough money");
            }
            productName = sc.nextLine();
        }

        System.out.printf("Change: %.2f", allMoney);
    }
}
