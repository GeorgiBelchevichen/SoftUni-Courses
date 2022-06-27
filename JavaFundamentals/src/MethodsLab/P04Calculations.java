package MethodsLab;

import java.util.Scanner;

public class P04Calculations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String command = sc.nextLine();
        int firstInput = Integer.parseInt(sc.nextLine());
        int secondInput = Integer.parseInt(sc.nextLine());

        switch (command){
            case "divide":
                printDivideNumbers(firstInput,secondInput);
                break;
            case "add" :
                printAddNumbers(firstInput,secondInput);
                break;
            case "multiply":
                printMultiplyNumbers(firstInput,secondInput);
                break;
            case "subtract":
                printSubtractNumbers(firstInput,secondInput);
                break;
        }
    }

    public static void printAddNumbers(int firstNum, int secondNum) {
        int result = firstNum + secondNum;
        System.out.println(result);
    }

    public static void printMultiplyNumbers(int firstNum, int secondNum) {
        int result = firstNum * secondNum;
        System.out.println(result);
    }

    public static void printDivideNumbers(int firstNum, int secondNum) {
        int result = firstNum / secondNum;
        System.out.println(result);
    }

    public static void printSubtractNumbers(int firstNum, int secondNum) {
        int result = firstNum + secondNum;
        System.out.println(result);
    }
}
