package DataTypesAndVariablesLab;

import java.util.Scanner;

public class P07ReversedChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char firstSymbol = sc.nextLine().charAt(0);
        char secondSymbol = sc.nextLine().charAt(0);
        char thirdSymbol = sc.nextLine().charAt(0);
        String result = String.format("%c %c %c",thirdSymbol,secondSymbol,firstSymbol);
        System.out.println(result);
    }
}
