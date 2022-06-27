package MethodsLab;

import java.util.Scanner;

public class P04Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());
        printTriangle(input);
    }
    public static void printTriangle(int n){
        for (int row = 1; row <= n; row++) {
            currentLine(1,row);
            System.out.println();
        }
        for (int row = n - 1; row >= 1 ; row--) {
            currentLine(1, row);
            System.out.println();
        }

    }
    public static void currentLine(int start, int end){
        for (int i = start; i <= end ; i++) {
            System.out.print(i + " ");


        }
    }
}
