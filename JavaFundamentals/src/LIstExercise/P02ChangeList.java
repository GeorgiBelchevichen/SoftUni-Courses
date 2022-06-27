package LIstExercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ChangeList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(sc.nextLine().split(" ")).
                map(Integer::parseInt).collect(Collectors.toList());
        String command = sc.nextLine();

        while (!command.equals("end")) {
            int element = Integer.parseInt(command.split(" ")[1]);
            if (command.contains("Delete")) {
                //element = Integer.parseInt(command.split(" ")[1]);
                numbers.removeAll(Collections.singletonList(element));
            } else if (command.contains("Insert")) {
                int position = Integer.parseInt(command.split(" ")[2]);
                numbers.add(position, element);
            }


            command = sc.nextLine();
        }
        for (int number:numbers
             ) {


            System.out.print(number + " ");
        }
    }
}
