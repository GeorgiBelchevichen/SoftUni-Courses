package BasicSyntaxLab;

import java.util.Scanner;

public class P09SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        int result = 0;
        for (int i = 1; i <= num * 2; i++) {
            if (i % 2 != 0) {
                result += i;
                System.out.println(i);
            }
        }
        System.out.println("Sum: " + result);
    }
}
