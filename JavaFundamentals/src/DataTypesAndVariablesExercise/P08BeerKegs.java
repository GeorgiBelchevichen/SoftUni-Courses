package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P08BeerKegs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        double biggestKeg = Double.MIN_VALUE;
        String maxVolume = "";
        for (int keg = 1; keg <= n; keg++) {
            String model = sc.nextLine();
            double radius = Double.parseDouble(sc.nextLine());
            int height = Integer.parseInt(sc.nextLine());
            // π * r^2 * h.
            double volume = Math.PI * Math.pow(radius, 2) * height;
            if (volume > biggestKeg){
                biggestKeg = volume;
                maxVolume = model;
            }
        }
        System.out.println(maxVolume);
    }
}
