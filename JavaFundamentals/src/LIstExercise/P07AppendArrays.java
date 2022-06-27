package LIstExercise;

import java.util.*;
import java.util.stream.Collectors;

public class P07AppendArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List <String> listSeparatedByPipe = Arrays.stream(sc.nextLine().
                split("\\|")).collect(Collectors.toList());
        Collections.reverse(listSeparatedByPipe);
        System.out.println(listSeparatedByPipe.toString().replace("[","").
                replace("]","").replace(",","").trim().replaceAll("\\s+"," "));
    }
}
