package BasicSyntaxLab;

import java.util.Scanner;

public class P08DivisibleBy3 {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        for (int i = 3; i <=100 ; i++) {
            if (i%3==0){
                System.out.println(i);
            }
        }
    }
}
