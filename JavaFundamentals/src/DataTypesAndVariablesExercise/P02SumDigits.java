package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P02SumDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n = Integer.parseInt(sc.nextLine());
        while (n > 0) {
            //find last digit
            int lastDigit = n % 10;
            sum += lastDigit;
            //remove last digit
            n = n / 10;
        }
        System.out.println(sum);
    }
}
