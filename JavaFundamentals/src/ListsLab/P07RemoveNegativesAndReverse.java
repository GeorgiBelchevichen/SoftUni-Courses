package ListsLab;

import java.util.*;
import java.util.stream.Collectors;

public class P07RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List <Integer> numbers = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        //int numbersLength = numbers.size();
        for (int i = 0; i < numbers.size(); i++) {
            int currentElement = numbers.get(i);
            if (currentElement < 0) {
                numbers.remove(numbers.get(i));
                i = i - 1;
            }
        }
            if (numbers.size()<= 0){
                System.out.println("empty");
            }else{
                //Collections.sort(numbers);
                Collections.reverse(numbers);
            }
        for (int element:numbers) {
            System.out.print(element + " ");
        }
    }
}
