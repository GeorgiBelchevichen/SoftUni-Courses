package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P09SpiceMustFlow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startingYield = Integer.parseInt(sc.nextLine());


        int countDays = 0;
        int totalAmount = 0;
        int yieldForWorkers = 26;
        while (startingYield >= 100) {
            countDays++;
            totalAmount += startingYield - yieldForWorkers;


            startingYield -= 10;
        }
        if (totalAmount >= 26) {
            totalAmount -= yieldForWorkers;
        }
        System.out.println(countDays);
        System.out.println(totalAmount);
    }
}
