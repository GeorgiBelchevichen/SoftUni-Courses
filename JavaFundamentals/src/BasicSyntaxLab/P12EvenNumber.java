package BasicSyntaxLab;

import java.util.Scanner;

public class P12EvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int even = Integer.parseInt(sc.nextLine());
        while (even % 2 != 0) {
            System.out.println("Please write an even number.");


            even = Integer.parseInt(sc.nextLine());
        }
        System.out.printf("The number is: %d", Math.abs(even));
    }
}
