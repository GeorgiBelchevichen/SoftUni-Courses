package LIstExercise;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05BombNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        String specialNumberWithPower = sc.nextLine();
        int specialNumber = Integer.parseInt(specialNumberWithPower.split(" ")[0]);
        int power = Integer.parseInt(specialNumberWithPower.split(" ")[1]);
        int sum = 0;
        while (numbers.contains(specialNumber)) {
            int indexSpecialNumber = numbers.indexOf(specialNumber);
            int left = Math.max(0,indexSpecialNumber-power);
            int right = Math.min(indexSpecialNumber + power,numbers.size()-1);
            for (int i = right; i >=left ; i--) {
                numbers.remove(i);
            }
        }
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }
}

