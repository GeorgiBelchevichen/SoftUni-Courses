package MethodsExercise;

import java.util.Scanner;

public class P07NxNMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        printMatrix(number);
    }

    private static void printMatrix(int n) {
        for (int row = 1; row <= n; row++) {
            for (int line = 1; line <= n; line++) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
