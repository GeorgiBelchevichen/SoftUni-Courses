package MethodsLab;

import java.util.Scanner;

public class P03PrintingTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        printTriangle(number);
    }

    public static void printTriangle(int num) {
        for (int row = 1; row <= num; row++) {
            for (int number = 1; number <= row; number++) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
        for (int row = num - 1; row >= 1; row--) {
            for (int i = 1; i <= row; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
}
