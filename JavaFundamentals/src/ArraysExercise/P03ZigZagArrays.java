package ArraysExercise;

//import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Arrays;
import java.util.Scanner;

public class P03ZigZagArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = Integer.parseInt(sc.nextLine());
        int[] firstArr = new int[rows];
        int[] secondArr = new int[rows];
        for (int row = 0; row < rows; row++) {
            int[] numbers = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (row % 2 == 0) {
                firstArr[row] = numbers[0];
                    secondArr[row] = numbers[1];
                }
            else {
                firstArr[row] = numbers [1];
                secondArr[row] = numbers[0];
            }
            }
        for (int firstNumbers:
             firstArr) {
            System.out.print(firstNumbers + " ");
        }
        System.out.println();
        for (int secondNumbers:
             secondArr) {
            System.out.print(secondNumbers + " ");
        }
        }
    }

