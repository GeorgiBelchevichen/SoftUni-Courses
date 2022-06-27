package MethodsExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P11ArrayManipulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String input = sc.nextLine();
        while (!input.equals("end")) {
            String commandType = input.split(" ")[0];
            switch (commandType) {
                case "exchange":
                    int index = Integer.parseInt(input.split(" ")[1]);
                    if (index >= 0 && index < numbers.length) {
                        numbers = getExchangeArray(numbers, index);
                    }else{
                        System.out.println("Invalid index");
                    }
                    break;
                case "min":

                    break;
                case "max":
                    break;
                case "first":
                    break;
                case "last":
                    break;

            }

            input = sc.nextLine();
        }
    }

    private static int[] getExchangeArray(int[] numbers, int index) {
        int[]resultArray = new int[numbers.length];
        for (int i = index + 1; i < numbers.length ; i++) {
resultArray[i - 3] += numbers[i];
        }
        for (int i = 0; i <= index; i++) {
            resultArray[i+2] += numbers[i];
        }
        numbers = resultArray;
        return numbers;
    }



}
