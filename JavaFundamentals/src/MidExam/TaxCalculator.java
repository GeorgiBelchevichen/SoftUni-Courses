package MidExam;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] vehicles = sc.nextLine().split(">>");
int sum = 0;
        for (int i = 0; i < vehicles.length; i++) {
            String[] vehicleType = vehicles[i].split(" ");
            String command = vehicleType[0];
            int years = Integer.parseInt(vehicleType[1]);
            int km = Integer.parseInt(vehicleType[2]);
            switch (command) {
                case "family":
                   int pay =  km  / 3000 * 12 + (50 - (years * 5));
                    //System.out.println(pay);
                    System.out.printf("A %s car will pay %.2f euros in taxes.%n",command,pay * 1.0);
                    sum+=pay;
                    break;
                case "heavyDuty":
                    int pay1 =  km  / 9000 * 14 + (80 - years * 8);
                    System.out.printf("A %s car will pay %.2f euros in taxes.%n",command,pay1 * 1.0);
                    sum+=pay1;
                    break;
                case "sports":
                    int pay2 =  km / 2000 * 18 + (100 - years * 9);
                    System.out.printf("A %s car will pay %.2f euros in taxes.%n",command,pay2 * 1.0);
                    sum+=pay2;
                    break;
                default:
                    System.out.println("Invalid car type.");
            }
        }
        System.out.printf("The National Revenue Agency will collect %.2f euros in taxes.",sum * 1.0);
    }
}
