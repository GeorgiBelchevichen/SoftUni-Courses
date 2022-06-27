package BasicSyntaxLab;

import java.util.Scanner;

public class P01StudentInformation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = Integer.parseInt(sc.nextLine());
        double average = Double.parseDouble(sc.nextLine());
        String production = String.format("Name: %s, Age: %d, Grade: %.2f",name,age,average);
        System.out.println(production);

    }
}
