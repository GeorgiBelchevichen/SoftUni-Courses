package ListsLab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> numbers = Arrays.stream(sc.nextLine().split(" ")).map(Double::parseDouble).
                collect(Collectors.toList());
        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i).equals(numbers.get(i + 1))) {
                numbers.set(i, numbers.get(i) + numbers.get(i + 1));
                numbers.remove(numbers.get(i + 1));
                i = -1;
            }
        }
        System.out.print(getDecimalFormat(numbers, " "));
    }

    private static String getDecimalFormat(List<Double> numbers, String delimiter) {
        String output = "";
        for (Double item : numbers
        ) {
            DecimalFormat df = new DecimalFormat("0.#");
            String numFormat = df.format(item) + delimiter;
            output += numFormat;
        }
        return output;
    }
}
