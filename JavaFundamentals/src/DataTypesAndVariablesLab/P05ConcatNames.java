package DataTypesAndVariablesLab;

import java.util.Scanner;

public class P05ConcatNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName = sc.nextLine();
        String secondName = sc.nextLine();
        String delimiter = sc.nextLine();
        System.out.printf("%s%s%s",firstName,delimiter,secondName);
    }
}
