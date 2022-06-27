package LIstExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P03HouseParty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbersOfCommands = Integer.parseInt(sc.nextLine());
        List<String> names = new ArrayList<>();
        for (int i = 1; i <= numbersOfCommands; i++) {
            String currentString = sc.nextLine();
            String currentName = currentString.split(" ")[0];

            if (currentString.contains("is going!")) {
                if (!names.contains(currentName)) {
                    names.add(currentName);
                }else{
                    System.out.printf("%s is already in the list!%n",currentName);
                }
            }else if (currentString.contains("is not going!")){
                if (!names.contains(currentName)){
                    System.out.printf("%s is not in the list!%n",currentName);
                }else{
                    names.remove(currentName);
                }
            }

        }
        for (String name:names) {
            System.out.println(name);
        }
    }
}
