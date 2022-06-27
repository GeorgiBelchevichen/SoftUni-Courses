package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P06EqualSums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbersArr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        boolean isFound = false;
        for (int index = 0; index < numbersArr.length; index++) {
           // int currentNumber = numbersArr[index];
            int leftSum = 0;
            int rightSum = 0;
            //лява сума
            for (int i = 0; i < index; i++) {
                leftSum += numbersArr[i];
            }
            //дясна сума
            for (int i = index + 1; i < numbersArr.length; i++) {
                rightSum += numbersArr[i];
            }
            if (leftSum == rightSum){
                System.out.println(index);
                isFound = true;
                break;
            }
        }
        if(!isFound){
            System.out.println("no");
        }
    }
}
