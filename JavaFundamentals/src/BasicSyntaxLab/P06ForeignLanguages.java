package BasicSyntaxLab;

import java.util.Scanner;

public class P06ForeignLanguages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String country = sc.nextLine();
        switch (country) {
            case "USA":
            case "England":
                System.out.println("English");
                break;
            case "Mexico":
            case "Argentina":
            case "Spain":
                System.out.println("Spanish");
                break;
            default:
                System.out.println("unknown");
                break;
        }
    }
}
