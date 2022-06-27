package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P10PokeMon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int power = Integer.parseInt(sc.nextLine());//N
        int distance = Integer.parseInt(sc.nextLine());//M
        int originalValue = power;
        int exhaustionFactor = Integer.parseInt(sc.nextLine());//Y
        int poke = 0;
        //int allDistance = 0;
        while (power > distance) {
            power -= distance;
            poke++;
            if (power == originalValue * 0.5) {
                //if (exhaustionFactor > 0) {
                    power = power / exhaustionFactor;
               // }
            }
        }
        System.out.println( power);
        System.out.println(poke);
    }
}
