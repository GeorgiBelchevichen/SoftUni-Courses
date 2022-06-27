package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class P05EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbersArr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int evenSum = 0;
        int oddSum = 0;
        for (int j : numbersArr) {
            if (j % 2 == 0) {
                evenSum += j;
            }
            else {
                oddSum += j;
            }
        }
            System.out.println(evenSum - oddSum);

    }
}
