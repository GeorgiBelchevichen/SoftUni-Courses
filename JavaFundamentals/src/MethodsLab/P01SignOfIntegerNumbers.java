package MethodsLab;

import java.util.Scanner;

public class P01SignOfIntegerNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());
        print(input);

    }

    public static void print(int sign) {
        if (sign > 0 ){
        System.out.printf("The number %d is positive.",sign);
        }else if (sign < 0){
            System.out.printf("The number %d is negative.",sign);
        }else{
            System.out.println("The number 0 is zero.");
        }
    }
}
