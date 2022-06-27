package MidExam;

import java.util.Scanner;

public class P08AnonymousThreat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double budget = Double.parseDouble(sc.nextLine());
        int students = Integer.parseInt(sc.nextLine());
        double priceForAPackageOfFlour = Double.parseDouble(sc.nextLine());
        double priceForASingleEgg = Double.parseDouble(sc.nextLine());
        double priceForASingleApron = Double.parseDouble(sc.nextLine());
        int counterFreePackage = 0;
        double priceForOneStudent = priceForAPackageOfFlour + (10 * priceForASingleEgg) + priceForASingleApron;
        double price20percentApron = Math.ceil(students * 20 * 1.0 / 100) * priceForASingleApron;
        for (int i = 1; i <=students ; i++) {
            if (i % 5 == 0){
                counterFreePackage++;
            }
        }
        double priceFree = counterFreePackage * priceForAPackageOfFlour;
        double needMoney = (priceForOneStudent * students) + price20percentApron - priceFree;
        double diff = Math.abs(budget - needMoney);
        if (needMoney>budget){
            System.out.printf("%.2f$ more needed.",diff);
        }
        else{
            System.out.printf("Items purchased for %.2f$.",needMoney);
        }
    }

}
