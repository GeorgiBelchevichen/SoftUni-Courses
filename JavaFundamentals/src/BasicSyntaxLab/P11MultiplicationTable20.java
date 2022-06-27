package BasicSyntaxLab;

import java.util.Scanner;

public class P11MultiplicationTable20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int theInteger = Integer.parseInt(sc.nextLine());
        int times = Integer.parseInt(sc.nextLine());
        for (int i = times; i <= 10; i++) {
                System.out.printf("%d X %d = %d%n", theInteger, i, theInteger * i);
        }
        if (times > 10){
            System.out.printf("%d X %d = %d%n", theInteger, times, theInteger * times);
        }
    }
}


