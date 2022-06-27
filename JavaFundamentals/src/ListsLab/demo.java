package ListsLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputLine = sc.nextLine();
        List<String> items = Arrays.stream(inputLine.split(" ")).collect(Collectors.toList());
        List <Integer> numbers = new ArrayList<>();
        for (int i = 0; i < items.size(); i++) {
             int currentNum = Integer.parseInt(items.get(i));
             numbers.add(currentNum);
        }
        for (Integer item : numbers){
            System.out.print(item + ", ");
        }
        System.out.println(numbers);
    }
}
