package BasicSyntaxLab;

import java.util.Scanner;

public class P03PassedOrFailed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = Double.parseDouble(sc.nextLine());
        if (num >= 3){
            System.out.println("Passed!");
        }else{
            System.out.println("Failed!");
        }
    }
}
