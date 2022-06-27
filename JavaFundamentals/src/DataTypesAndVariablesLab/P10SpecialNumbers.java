package DataTypesAndVariablesLab;

import java.util.Scanner;

public class P10SpecialNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int num = 1;num<=n;num++) {
            int currentNum = num;
            int sum = 0;
            while (currentNum > 0) {
                int lastDigit = currentNum % 10;
                sum += lastDigit;
                currentNum = currentNum / 10;
            }
                if (sum == 5 || sum == 7 || sum == 11) {
                    System.out.printf("%d -> True%n",num);
                }else{
                    System.out.printf("%s -> False%n",num);
                }

        }
    }
}
