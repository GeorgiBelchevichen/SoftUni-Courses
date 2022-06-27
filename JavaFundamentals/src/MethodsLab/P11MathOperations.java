package MethodsLab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P11MathOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNumber = Integer.parseInt(sc.nextLine());
        char operator = sc.nextLine().charAt(0);
        int secondNumber = Integer.parseInt(sc.nextLine());
        DecimalFormat df = new DecimalFormat("0.##");
        switch (operator) {
            case '+':
                double resultAdd = calculateAdd(firstNumber, secondNumber);
                System.out.println(df.format(resultAdd));
                break;
            case '-':
                double resultSubtract = calculateSubtract(firstNumber, secondNumber);
                System.out.println(df.format(resultSubtract));
                break;
            case '/':
                double resultDivide = calculateDivide(firstNumber, secondNumber);
                System.out.println(df.format(resultDivide));
                break;
            case '*':
                double resultMultiply = calculateMultiply(firstNumber, secondNumber);
                System.out.println(df.format(resultMultiply));
                break;
        }
    }

    public static double calculateSubtract(double firstNum, double secondNum) {
        return firstNum - secondNum;
    }

    public static double calculateAdd(double firstNum, double secondNum) {
        return firstNum + secondNum;
    }

    public static double calculateMultiply(double firstNum, double secondNum) {
        return firstNum * secondNum;
    }

    public static double calculateDivide(double firstNum, double secondNum) {
        return firstNum / secondNum;
    }
}
