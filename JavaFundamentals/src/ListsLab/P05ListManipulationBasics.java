package ListsLab;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05ListManipulationBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbersList = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<String> commandLine = Arrays.stream(sc.nextLine().split(" ")).collect(Collectors.toList());
        while (!commandLine.get(0).equals("end")) {
            //List<String> commandLine = Arrays.stream(sc.nextLine().split(" ")).collect(Collectors.toList());
            String commandType = commandLine.get(0);
            int number;
            int index;
            switch (commandType) {
                case "Add":
                    number = Integer.parseInt(commandLine.get(1));
                    numbersList.add(number);
                    break;
                case "Remove":
                    number = Integer.parseInt(commandLine.get(1));
                    numbersList.remove(Integer.valueOf(number));
                    break;
                case "RemoveAt":
                    index = Integer.parseInt(commandLine.get(1));
                    numbersList.remove(index);
                    break;
                case "Insert":
                    index = Integer.parseInt(commandLine.get(2));
                    number = Integer.parseInt(commandLine.get(1));
                    numbersList.add(index,number);
                    break;
            }
            commandLine = Arrays.stream(sc.nextLine().split(" ")).collect(Collectors.toList());
        }
        System.out.println(numbersList.toString().replaceAll("[\\[\\],]", ""));
    }
}
