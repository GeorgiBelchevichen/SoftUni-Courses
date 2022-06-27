package MethodsExercise;


import java.util.Scanner;

public class P02VowelsCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toLowerCase();
        printCountVowels(input);

    }

    private static void printCountVowels(String text) {
        int count = 0;
        for (int letter = 0; letter <= text.length()-1; letter++) {

            if (text.charAt(letter) == 'a' || text.charAt(letter) == 'e' || text.charAt(letter) == 'i'
                    || text.charAt(letter) == 'u' || text.charAt(letter) == 'o') {
                count++;
            }

        }
        System.out.println(count);
    }
}
