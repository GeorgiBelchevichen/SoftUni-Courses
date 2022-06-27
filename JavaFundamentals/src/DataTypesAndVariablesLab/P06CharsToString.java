package DataTypesAndVariablesLab;

import java.util.Scanner;

public class P06CharsToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char firstLine = sc.nextLine().charAt(0);
        char secondLine =sc.nextLine().charAt(0);
        char thirdLine = sc.nextLine().charAt(0);
        System.out.printf("%c%c%c",firstLine,secondLine,thirdLine);
        System.out.println("" + firstLine + secondLine + thirdLine);
    }
}
