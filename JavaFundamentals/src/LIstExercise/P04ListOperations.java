package LIstExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04ListOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(sc.nextLine().split(" ")).
                map(Integer::parseInt).collect(Collectors.toList());
        String command = sc.nextLine();
        int index;
        int number;
        int count;
        while (!command.equals("End")) {
            if (command.contains("Add")) {
                number = Integer.parseInt(command.split(" ")[1]);
                numbers.add(number);
            } else if (command.contains("Insert")) {
                index = Integer.parseInt(command.split(" ")[2]);
                number = Integer.parseInt(command.split(" ")[1]);
                if (isValidIndex(index, numbers)) {
                    numbers.add(index, number);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (command.contains("Remove")) {
                index = Integer.parseInt(command.split(" ")[1]);
                if (isValidIndex(index, numbers)) {
                    numbers.remove(index);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (command.contains("Shift left")) {
                count = Integer.parseInt(command.split(" ")[2]);
                for (int i = 1; i <= count; i++) {
                    int firstNumber = numbers.get(0);
                    numbers.add(firstNumber);
                    numbers.remove(0);

                }
            } else if (command.contains("Shift right")) {
                count = Integer.parseInt(command.split(" ")[2]);
                for (int i = 0; i < count; i++) {
                    int lastNumber = numbers.get(numbers.size()-1);
                    numbers.add(0,lastNumber);
                    numbers.remove(numbers.size() - 1);
                }
            }


            command = sc.nextLine();
        }
        for (int num:numbers
             ) {
            System.out.print(num + " ");
        }
    }

    private static boolean isValidIndex(int index, List<Integer> numbers) {
        return index >= 0 && index < numbers.size();
    }
}

