package MethodsExercise;

import java.util.Scanner;

public class P10TopNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        for (int num = 1; num <= number ; num++) {
            if (sumOfDigitsIsDivisibleBy8(num) && haveAnOddDigit(num)){
                System.out.println(num);
            }
        }
    }

    // метод които проверява дали сумата от цифрите се дели на 8
    private static boolean sumOfDigitsIsDivisibleBy8(int number) {
        int sumDigit = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            sumDigit+=lastDigit;
            number /= 10;
        }
        return sumDigit % 8 == 0;
    }
// метод,който проверява дали има нечетна цифра в числото
    private static boolean haveAnOddDigit(int number) {
        while (number > 0) {
            int lastDigit = number % 10;

            if (lastDigit % 2 != 0) {
                return true;
            }
            number /= 10;
        }
        return false;
    }
}

