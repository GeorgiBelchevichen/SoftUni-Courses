package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P04SumOfChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfLines = Integer.parseInt(sc.nextLine());
        int sum = 0;
        for (int i = 1; i <= numberOfLines ; i++) {
            char currentSymbol = sc.nextLine().charAt(0);
            sum += currentSymbol;

        }
        System.out.printf("The sum equals: %d",sum);
    }
}
