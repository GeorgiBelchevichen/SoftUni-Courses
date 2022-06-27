package BasicSyntaxExercise;

import java.util.Scanner;

public class P09Orders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double allPrice = 0;
        int N = Integer.parseInt(sc.nextLine());
        for (int order = 1; order <= N; order++) {
            double pricePerCapsule = Double.parseDouble(sc.nextLine());
            int days = Integer.parseInt(sc.nextLine());
            int capsulesCount = Integer.parseInt(sc.nextLine());
            double orderPrice = pricePerCapsule * capsulesCount * days;
            allPrice +=orderPrice;
            System.out.printf("The price for the coffee is: $%.2f%n",orderPrice);
        }
        System.out.printf("Total: $%.2f",allPrice);
    }
}
