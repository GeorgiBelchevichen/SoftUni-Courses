package BasicSyntaxExercise;

import java.util.Scanner;

public class P11RageExpenses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lostGamesCount = Integer.parseInt(sc.nextLine());
        double headsetPrice = Double.parseDouble(sc.nextLine());
        double mousePrice = Double.parseDouble(sc.nextLine());
        double keyboardPrice = Double.parseDouble(sc.nextLine());
        double displayPrice = Double.parseDouble(sc.nextLine());
        int countHeadsets = 0;
        int countMouse = 0;
        int countKeyboards = 0;
        int countDisplays = 0;
        for (int game = 1; game <=lostGamesCount ; game++) {
            if (game % 2 == 0){
                countHeadsets ++;
            }if (game % 3 == 0){
                countMouse ++;
            }if (game % 6 == 0){
                countKeyboards++;
            }if (game % 12 == 0){
                countDisplays++;
            }
        }
        double allPrice = countDisplays * displayPrice + countHeadsets * headsetPrice + countMouse * mousePrice + countKeyboards * keyboardPrice;
        System.out.printf("Rage expenses: %.2f lv.",allPrice);
    }
}
