package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P07MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] array = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int currentLength = 1;
        int maxLength = 0;
        int startIndex = 0;
        int bestStart = 0;
        for (int index = 1; index < array.length ; index++) {
            if (array[index] == array[index - 1]){
                currentLength++;
            }
            else{
                currentLength = 1;
                startIndex = index;
            }
            if (currentLength > maxLength){
                maxLength = currentLength;
                bestStart = startIndex ;
            }
        }

        for (int i = bestStart; i < bestStart + maxLength ; i++) {
            System.out.print(array[i] + " ");
        }
        }
    }
