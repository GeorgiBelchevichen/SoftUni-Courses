package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class P07CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbersArr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        while (numbersArr.length > 1) {
            int[] condensed = new int[numbersArr.length - 1];
            for (int i = 0; i < numbersArr.length - 1; i++) {
                condensed[i] = numbersArr[i] + numbersArr[i + 1];

            }
            numbersArr = condensed;
        }
        System.out.println(numbersArr[0]);
    }
}
