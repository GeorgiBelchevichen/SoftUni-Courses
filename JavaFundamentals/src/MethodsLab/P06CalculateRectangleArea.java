package MethodsLab;

import java.util.Scanner;

public class P06CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double widthInput = Double.parseDouble(sc.nextLine());
        double lengthInput = Double.parseDouble(sc.nextLine());
         double area = getRectangleArea(widthInput,lengthInput);
        System.out.printf("%.0f",area);
    }

    public static double getRectangleArea(double width, double length) {
        return width * length;
    }
}
