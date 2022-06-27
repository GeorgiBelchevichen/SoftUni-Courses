package DataTypesAndVariablesLab;

import java.math.BigDecimal;
import java.util.Scanner;

public class P03ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigDecimal sum = new BigDecimal(0);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= n; i++) {
            BigDecimal currentNum = new BigDecimal(sc.nextLine());
            sum = sum.add(currentNum);
        }
        System.out.println(sum);
    }
}
