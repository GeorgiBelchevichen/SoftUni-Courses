package ArraysMoreExercise;


import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfString = Integer.parseInt(sc.nextLine());
        int [] result = new int[numberOfString];
        for (int i = 1; i <= numberOfString; i++) {
            String text = sc.nextLine();
            int vowels = 0;
            int consonant = 0;
            for (int j = 0; j < text.length(); j++) {
                char currentLetter = text.charAt(j);
                if (currentLetter == 'a' || currentLetter == 'e' || currentLetter == 'o' || currentLetter == 'i' ||
                        currentLetter == 'u' || currentLetter == 'A' || currentLetter == 'E' || currentLetter == 'O' || currentLetter == 'I' ||
                        currentLetter == 'U' ) {
                    vowels += currentLetter * text.length();
                } else {
                    consonant += currentLetter / text.length();
                }
            }
             int sum = vowels + consonant;
            result [i - 1] = sum;
        }
        Arrays.sort(result);
        for (int j : result) {
            System.out.println(j);
        }
    }
}
