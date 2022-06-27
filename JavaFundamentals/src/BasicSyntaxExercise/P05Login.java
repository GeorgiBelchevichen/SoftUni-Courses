package BasicSyntaxExercise;

import java.util.Scanner;

public class P05Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        String password = "";
        for (int position = username.length() - 1; position >= 0; position--) {
            char currentSymbol = username.charAt(position);
            password += currentSymbol;
        }
        int counterPass = 0;
        String pass = sc.nextLine();
        while (!pass.equals(password)) {
            counterPass++;
            if (counterPass == 4){
                System.out.printf("User %s blocked!",username);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            pass = sc.nextLine();
        }
        if (pass.equals(password)) {
            System.out.printf("User %s logged in.", username);
        }
    }
}
