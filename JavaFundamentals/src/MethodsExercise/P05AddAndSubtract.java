package MethodsExercise;

import java.util.Scanner;

public class P05AddAndSubtract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNum = Integer.parseInt(sc.nextLine());
        int secondNum = Integer.parseInt(sc.nextLine());
        int thirdNum = Integer.parseInt(sc.nextLine());
        System.out.println(addFirstAndSecondNumbers(firstNum, secondNum, thirdNum));

    }

    private static int addFirstAndSecondNumbers(int n1, int n2, int n3) {
        return n1 + n2 - n3;
    }
}
