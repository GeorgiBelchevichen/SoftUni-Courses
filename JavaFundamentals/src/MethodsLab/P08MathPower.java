package MethodsLab;


import java.text.DecimalFormat;
import java.util.Scanner;

public class P08MathPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.####");
        double number = Double.parseDouble(sc.nextLine());
        int power = Integer.parseInt(sc.nextLine());
        System.out.println(df.format(mathPower(number,power)));

    }

    public static double mathPower(double num, double numberPower) {
        double result = 1;
        for (int i = 1; i <= numberPower; i++) {
            result *= num;
        }
        return result;

    }
}
