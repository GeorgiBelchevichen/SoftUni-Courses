package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P05PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = Integer.parseInt(sc.nextLine());
        int finish = Integer.parseInt(sc.nextLine());
        for (int symbol = start;symbol<= finish;symbol++){
            System.out.printf("%c ",symbol);
        }
    }
}
