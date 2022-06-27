package MethodsExercise;

import java.util.Scanner;

public class P03CharactersInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char symbol1 = sc.nextLine().charAt(0);
        char symbol2 = sc.nextLine().charAt(0);
        printSymbols(symbol1, symbol2);
    }

    private static void printSymbols(char firstSymbol, char secondSymbol) {
        if (firstSymbol < secondSymbol) {
            for (char symbol = (char) (firstSymbol + 1); symbol < secondSymbol; symbol++) {
                System.out.print(symbol + " ");
            }

        } else if (secondSymbol < firstSymbol) {
            for (char symbol = (char) (secondSymbol + 1); symbol < firstSymbol; symbol++) {
                System.out.print(symbol + " ");
            }
        }
    }
}