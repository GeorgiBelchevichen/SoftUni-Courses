package MethodsLab;

import java.util.Scanner;

public class P07RepeatString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int n = Integer.parseInt(sc.nextLine());
        System.out.println(repeatString(text,n));

    }

    public static String repeatString(String str, int n) {
        String text = "";
        for (int i = 1; i <= n; i++) {
            text += str;
        }
            return text;

    }
}
