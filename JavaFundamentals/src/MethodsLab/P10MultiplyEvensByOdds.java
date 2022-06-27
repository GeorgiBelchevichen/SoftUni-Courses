package MethodsLab;

import java.util.Scanner;

public class P10MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberInput = Math.abs(Integer.parseInt(sc.nextLine()));
        System.out.println(getMultipleOfEvensAndOdds(numberInput));
    }

    public static int getMultipleOfEvensAndOdds(int number) {
        int sumEvenDigits = 0;
        int sumOddDigits = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            if (lastDigit % 2 == 0) {
                sumEvenDigits += lastDigit;
            } else {
                sumOddDigits += lastDigit;
            }
            number = number / 10;
        }
        return sumEvenDigits * sumOddDigits;
    }
}
