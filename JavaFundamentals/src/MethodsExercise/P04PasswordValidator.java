package MethodsExercise;

import java.util.Scanner;

public class P04PasswordValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        if (!isValidLength(password)){
            System.out.println("Password must be between 6 and 10 characters");
        } if (!isValidContent(password)){
            System.out.println("Password must consist only of letters and digits");
        }if (!isValidCountDigit(password)){
            System.out.println("Password must have at least 2 digits");
        }
        if (isValidContent(password)&&isValidLength(password)&&isValidCountDigit(password)){
            System.out.println("Password is valid");
        }
    }

    //метод за валидна дължина
    private static boolean isValidLength(String password) {
        return password.length() >= 6 && password.length() <= 10;
    }

    //метод за валидно съдържание
    private static boolean isValidContent(String password) {
        for (char symbol : password.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol)) {
                return false;
            }
        }
        return true;
    }

    //метод проверяваш наличието на цифри
    private static boolean isValidCountDigit(String password) {
        int count = 0;
        for (char symbol : password.toCharArray()) {
            if (Character.isDigit(symbol)) {
                count++;
            }

        }
        return count >= 2;
    }
}
