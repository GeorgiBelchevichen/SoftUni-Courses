package ArraysExercise;

import java.util.Scanner;

public class P01Train {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countWagons = Integer.parseInt(sc.nextLine());
        int numbersPeople = 0;
        int [] peopleArr = new int[countWagons];
        for (int currentWagon = 0; currentWagon <= countWagons - 1; currentWagon++) {
            int peopleInWagon  = Integer.parseInt(sc.nextLine());
             peopleArr [currentWagon] = peopleInWagon;
        }
        for (int people :
             peopleArr) {
            System.out.print(people + " ");
            numbersPeople +=people;
        }
        System.out.println();
        System.out.println(numbersPeople);
    }
}
