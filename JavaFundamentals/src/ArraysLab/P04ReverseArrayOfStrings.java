package ArraysLab;

//import java.util.Arrays;

import java.util.Scanner;

public class P04ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] array = sc.nextLine().split(" ");
        for (int i = 0; i < array.length / 2; i++) {
            String oldElement = array[array.length - 1 - i];
            array[array.length - 1 - i] = array[i];
            array[i] = oldElement;
            // System.out.print(array[i] + " ");
        }
        System.out.print(String.join(" ", array));
    }

}