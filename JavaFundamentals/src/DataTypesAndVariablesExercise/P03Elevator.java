package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P03Elevator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfPeople = Integer.parseInt(sc.nextLine());
        double capacityElevator = Double.parseDouble(sc.nextLine());
        double courses = Math.ceil(numberOfPeople  / capacityElevator);
        System.out.printf("%.0f",courses);
    }
}
