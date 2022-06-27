package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P04ArrayRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rotation = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= rotation; i++) {
            int firsIndex = numbers[0];

            for (int index = 0; index < numbers.length - 1; index++) {
                numbers[index] = numbers[index + 1];
            }
            numbers[numbers.length - 1] = firsIndex;
        }
        for (int currentNumber:
             numbers) {
            System.out.print(currentNumber + " ");
        }
    }
}

