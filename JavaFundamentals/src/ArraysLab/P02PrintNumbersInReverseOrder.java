package ArraysLab;

import java.util.Scanner;

public class P02PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] numbersArr = new int[n];
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(sc.nextLine());
            numbersArr[i] = number;

        }
        for (int i = numbersArr.length - 1; i >= 0; i--) {
            System.out.print(numbersArr[i] + " ");
        }
    }
}
