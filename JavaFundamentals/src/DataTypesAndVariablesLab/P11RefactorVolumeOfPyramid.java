package DataTypesAndVariablesLab;

import java.util.Scanner;

public class P11RefactorVolumeOfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double length = Double.parseDouble(sc.nextLine());
        double width = Double.parseDouble(sc.nextLine());
        double height =Double.parseDouble(sc.nextLine());
        System.out.print("Length: ");
        System.out.print("Width: ");
        System.out.print("Height: ");

        double V = (length * width * height) / 3;
        System.out.printf("Pyramid Volume: %.2f", V);

    }
}
