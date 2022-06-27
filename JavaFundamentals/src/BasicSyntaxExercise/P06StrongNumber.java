package BasicSyntaxExercise;

import java.util.Scanner;

public class P06StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        int startNumber = number;
        int sumFactorials = 0;
        while (number > 0) {
            int factorialLastDigit = 1;
            int lastDigit = number % 10;
            for (int currentDigit = 1; currentDigit <= lastDigit; currentDigit++) {
                factorialLastDigit *= currentDigit;
            }
            sumFactorials += factorialLastDigit;
            number = number / 10;
        }
        if (sumFactorials == startNumber ){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}

