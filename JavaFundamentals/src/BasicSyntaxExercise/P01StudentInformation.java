package BasicSyntaxExercise;

import java.util.Scanner;

public class P01StudentInformation {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int age = Integer.parseInt(sc.nextLine());
        if (age >= 0 && age <= 2) {
            System.out.println("baby");
        }
//    •	0-2 – baby;
//•	3-13 – child;
        else if (age >= 3 && age <= 13) {
            System.out.println("child");
        }
//•	14-19 – teenager;
        else if (age >= 14 && age <= 19) {
            System.out.println("teenager");
        }
//•	20-65 – adult;
        else if (age >= 20 && age <= 65) {
            System.out.println("adult");
        }
//•	>=66 – elder
        else if (age>65){
            System.out.println("elder");
        }
    }
}