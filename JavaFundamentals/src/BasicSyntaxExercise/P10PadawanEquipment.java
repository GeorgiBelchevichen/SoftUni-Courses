package BasicSyntaxExercise;

import java.util.Scanner;

public class P10PadawanEquipment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double amountOfMoney = Double.parseDouble(sc.nextLine());
        int countOfStudents = Integer.parseInt(sc.nextLine());
        double priceForOneSaber = Double.parseDouble(sc.nextLine());
        double priceForOneRobe = Double.parseDouble(sc.nextLine());
        double priceForOneBelt = Double.parseDouble(sc.nextLine());
        double priceForSabers = (priceForOneSaber * Math.ceil(countOfStudents * 1.10));
        double priceForRobes = countOfStudents * priceForOneRobe;
        double priceForBelts = 0;
        for (int belt = 1; belt <=countOfStudents ; belt++) {
            if (belt % 6 != 0 ){
                priceForBelts +=priceForOneBelt;
            }
        }
        double allPrice = priceForSabers + priceForBelts + priceForRobes;
        double diff = Math.abs(amountOfMoney - allPrice);
        if (allPrice <= amountOfMoney){
            System.out.printf("The money is enough - it would cost %.2flv.",allPrice);
        }else{
            System.out.printf("George Lucas will need %.2flv more.",diff);
        }
    }
}
