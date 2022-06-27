package MethodsExercise;

import java.util.Scanner;

public class P06MiddleCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        printMiddleCharacter(text);
    }

    private static void printMiddleCharacter(String text) {
        if (text.length() % 2 != 0) {
            System.out.print(text.charAt(text.length()/2));
        }else{
            System.out.print(text.charAt(text.length()/2 - 1));
            System.out.println(text.charAt(text.length()/2));
        }

    }
}
