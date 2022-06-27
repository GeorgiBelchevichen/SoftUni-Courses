package ArraysExercise;

import java.util.Scanner;

public class P02CommonElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] firstArr = sc.nextLine().split(" ");
        String [] secondArr = sc.nextLine().split(" ");
        for (String elementFirstArr:
             firstArr) {
            for (String elementSecondArr:
                 secondArr) {
                if (elementFirstArr.equals(elementSecondArr)){
                    System.out.print(elementFirstArr + " ");
                    break;
                }
            }
        }
    }
}
