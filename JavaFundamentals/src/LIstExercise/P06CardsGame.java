package LIstExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P06CardsGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> firstHandOfCards = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondHandOfCards = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        while (firstHandOfCards.size() > 0 && secondHandOfCards.size() > 0) {
            if (firstHandOfCards.get(0) > secondHandOfCards.get(0)) {
                firstHandOfCards.add(firstHandOfCards.get(0));
                firstHandOfCards.add(secondHandOfCards.get(0));
                firstHandOfCards.remove(0);
                secondHandOfCards.remove(0);
            }else if (secondHandOfCards.get(0)>firstHandOfCards.get(0)){
                secondHandOfCards.add(secondHandOfCards.get(0));
                secondHandOfCards.add(firstHandOfCards.get(0));
                firstHandOfCards.remove(0);
                secondHandOfCards.remove(0);
            }else {
                firstHandOfCards.remove(0);
                secondHandOfCards.remove(0);
            }
        }
        if (firstHandOfCards.isEmpty()){
            System.out.printf("Second player wins! Sum: %d",getCardsSum(secondHandOfCards));
        }else{

            System.out.printf("First player wins! Sum: %d",getCardsSum(firstHandOfCards));
        }

    }
    public static int getCardsSum(List<Integer>numbers){
        int result = 0;
        for (int num:numbers
             ) {
           result += num;
        }
        return result;
    }
}
