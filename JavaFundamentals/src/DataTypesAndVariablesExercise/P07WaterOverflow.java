package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P07WaterOverflow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int litersInTheTank = 0;
        int n = Integer.parseInt(sc.nextLine());
        for (int line = 1; line <= n; line++) {
            int quantityOfWater = Integer.parseInt(sc.nextLine());
            if (quantityOfWater <= 255 && (litersInTheTank + quantityOfWater) <= 255) {
                litersInTheTank += quantityOfWater;
            } else {
                System.out.println("Insufficient capacity!");
            }

        }
        System.out.println(litersInTheTank);
    }
}
