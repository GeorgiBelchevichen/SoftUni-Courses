package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P05TopIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbersArr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < numbersArr.length; i++) {
            int maxValue = Integer.MIN_VALUE;
            for (int j = i + 1; j < numbersArr.length; j++) {
                if (numbersArr[j]>maxValue){
                    maxValue = numbersArr[j];
                }
            }
            if (numbersArr[i] > maxValue) {
                System.out.print(numbersArr[i] + " ");
            }
        }
    }
}
