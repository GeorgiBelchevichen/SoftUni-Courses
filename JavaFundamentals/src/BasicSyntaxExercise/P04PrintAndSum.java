package BasicSyntaxExercise;

import java.util.Scanner;

public class P04PrintAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = Integer.parseInt(sc.nextLine());
        int finish = Integer.parseInt(sc.nextLine());
        int sum = 0;
        for (int i = start; i <=finish ; i++) {
            sum +=i;
            System.out.print(i+" ");
        }
        System.out.printf("%nSum: %d",sum);
    }
}
