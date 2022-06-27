package MethodsExercise;

import java.util.Scanner;

public class P1SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNumber = Integer.parseInt(sc.nextLine());
        int secondNumber = Integer.parseInt(sc.nextLine());
        int thirdNumber = Integer.parseInt(sc.nextLine());

        printSmallestNumber(firstNumber,secondNumber,thirdNumber);

    }

    private static void printSmallestNumber(int n1, int n2, int n3) {
        if (n1 < n2 && n1 < n3) {
            System.out.println(n1);
        } else if (n2 < n1 && n2 < n3) {
            System.out.println(n2);

        } else {
            System.out.println(n3);
        }
    }
}
