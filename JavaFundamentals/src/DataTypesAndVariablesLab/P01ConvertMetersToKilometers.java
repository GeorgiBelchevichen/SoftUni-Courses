package DataTypesAndVariablesLab;

import java.util.Scanner;

public class P01ConvertMetersToKilometers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int distanceInMeters = Integer.parseInt(sc.nextLine());
        double km = distanceInMeters / 1000.0;
        System.out.printf("%.2f",km);
    }
}
