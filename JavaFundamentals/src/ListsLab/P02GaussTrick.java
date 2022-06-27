package ListsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02GaussTrick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        for (int i = 0; i < numbers.size() / 2; i++) {
            int firstNumber = numbers.get(i);
            int secondNumber = numbers.get(numbers.size() - 1 - i);
            numbers.set(i, firstNumber + secondNumber);
        }if (numbers.size()% 2 == 0) {
            numbers.removeAll(numbers.subList(numbers.size() / 2, numbers.size()));
        }else {
            numbers.removeAll(numbers.subList(numbers.size() / 2 + 1, numbers.size()));
        }
        for (int item : numbers
        ) {
            System.out.print(item + " ");
        }
    }
}
