package MethodsExercise;

import java.util.Scanner;

public class P09PalindromeIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String command = sc.nextLine();
        while (!command.equals("END")) {
            int number = Integer.parseInt(command);
            System.out.println(isPalindrome(command));

            command = sc.nextLine();
        }
    }

    private static boolean isPalindrome(String number) {
        String reversedNumber = "";
        for (int i = number.length() - 1; i >= 0; i--) {
            reversedNumber += number.charAt(i);
        }
        return reversedNumber.equals(number);
    }
}
