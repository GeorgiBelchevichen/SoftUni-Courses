package ListsLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numList = Arrays.stream(sc.nextLine().split(" ")).
                map(Integer::parseInt).collect(Collectors.toList());
        String input = sc.nextLine();
        while (!input.equals("end")) {
            List<String> commandLine = Arrays.stream(input.split(" ")).collect(Collectors.toList());
            String commandType = commandLine.get(0);
            String command;
            int number;
            switch (commandType) {
                case "Contains":
                    number = Integer.parseInt(commandLine.get(1));
                    checkContainsNumber(numList, number);
                    break;
                case "Print":
                    command = commandLine.get(1);
                    printEvenNumbersOrOddNumbers(numList, command);
                    break;
                case "Get":
                    printSumList(numList);
                    break;
                case "Filter":
                    String condition = commandLine.get(1);
                    number = Integer.parseInt(commandLine.get(2));
                    System.out.println(getConditionNumbers(numList, condition, number)
                            .toString().replaceAll("[\\[\\],]", ""));
                    break;

            }
            input = sc.nextLine();
        }
    }

    public static void checkContainsNumber(List<Integer> numbers, int number) {
        boolean isFound = false;
        for (int currentElement : numbers) {
            if (currentElement == number) {
                isFound = true;
                break;
            }
        }

        if (isFound) {
            System.out.println("Yes");
        } else {
            System.out.println("No such number");
        }

    }

    public static void printEvenNumbersOrOddNumbers(List<Integer> numbers, String command) {
        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();
        for (int currentElement : numbers) {
            if (currentElement % 2 == 0) {
                evenNumbers.add(currentElement);
            } else {
                oddNumbers.add(currentElement);
            }
        }
        if (command.equals("odd")) {
            System.out.println(oddNumbers.toString().replaceAll("[\\[\\],]", ""));
        } else {
            System.out.println(evenNumbers.toString().replaceAll("[\\[\\],]", ""));
        }
    }

    private static void printSumList(List<Integer> numbers) {
        int sum = 0;
        for (int element : numbers) {
            sum += element;
        }
        System.out.println(sum);
    }

    private static List<Integer> getConditionNumbers(List<Integer> numbers, String condition, int number) {
        List<Integer> resultList = new ArrayList<>();
        for (int currentElement : numbers) {
            if (condition.equals(">")) {
                if (currentElement > number) {
                    resultList.add(currentElement);
                }
            }
            if (condition.equals(">=")) {
                if (currentElement >= number) {
                    resultList.add(currentElement);
                }
            }
            if (condition.equals("<")) {
                if (currentElement < number) {
                    resultList.add(currentElement);
                }
            }
            if (condition.equals("<=")) {
                if (currentElement <= number) {
                    resultList.add(currentElement);
                }

            }
        }
        return resultList;
    }
}
