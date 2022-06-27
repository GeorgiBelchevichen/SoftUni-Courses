package DataTypesAndVariablesLab;

import java.util.Scanner;

public class P04TownInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nameOfTown = sc.nextLine();
        int population = sc.nextInt();
        double area = sc.nextDouble();
        System.out.printf("Town %s has population of %d and area %.0f square km.",nameOfTown,population,area);
    }
}
