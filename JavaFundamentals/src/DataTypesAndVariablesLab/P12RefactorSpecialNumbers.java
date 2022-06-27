package DataTypesAndVariablesLab;

import java.util.Scanner;

public class P12RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for (int num = 1; num <= n; num++) {
            int currentNum = num;
            boolean isSpecialNumber = false;
            int sum = 0;
            while (currentNum > 0) {
                sum += currentNum % 10;
                currentNum = currentNum / 10;
            }
            isSpecialNumber = (sum == 5) || (sum == 7) || (sum == 11);
            if (isSpecialNumber){
                System.out.printf("%d -> True%n",num);
            }else {
                System.out.printf("%d -> False%n",num);
            }


        }
    }
}
