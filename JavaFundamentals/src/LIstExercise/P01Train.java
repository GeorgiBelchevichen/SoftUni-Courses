package LIstExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01Train {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> listOfWagons = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        int capacityWagon = Integer.parseInt(sc.nextLine());
        int passengers;
        String input = sc.nextLine();
        while (!input.equals("end")) {
            if (input.contains("Add")) {
                passengers = Integer.parseInt(input.split(" ")[1]);
                listOfWagons.add(passengers);
            } else {
                passengers = Integer.parseInt(input);
                for (int index = 0; index < listOfWagons.size(); index++) {
                    if (listOfWagons.get(index) + passengers <= capacityWagon) {
                        listOfWagons.set(index, listOfWagons.get(index) + passengers);
                        break;
                    }
                }
            }


            input = sc.nextLine();
        }
        for (int people : listOfWagons) {
            System.out.print(people + " ");
        }

    }
}
