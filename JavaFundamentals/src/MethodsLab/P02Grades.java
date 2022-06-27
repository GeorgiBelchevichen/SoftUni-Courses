package MethodsLab;

import java.util.Scanner;

public class P02Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double gradeInput = Double.parseDouble(sc.nextLine());

        printResult(gradeInput);

    }
//            •	2.00 – 2.99 - "Fail"
//            •	3.00 – 3.49 - "Poor"
//            •	3.50 – 4.49 - "Good"
//            •	4.50 – 5.49 - "Very good"
//            •	5.50 – 6.00 - "Excellent"

    public static void printResult(double grade) {
        if (grade >= 2 && grade < 3){
            System.out.println("Fail");
        }
        else if (grade >= 3 && grade < 3.5){
            System.out.println("Poor");
        }
        else if (grade >= 3.5 && grade < 4.5){
            System.out.println("Good");
        }
        else if (grade >= 4.5 && grade < 5.5){
            System.out.println("Very good");
        }
        else if (grade >= 5.5 && grade <= 6){
            System.out.println("Excellent");
        }
    }

}
