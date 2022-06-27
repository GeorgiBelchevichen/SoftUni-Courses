package BasicSyntaxExercise;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfPerson = Integer.parseInt(sc.nextLine());
        String typePeople = sc.nextLine();
        String dayOfWeek = sc.nextLine();

        double price = 0;
        switch (dayOfWeek) {
            case "Friday":
                switch (typePeople) {
                    case "Students":
                        price = 8.45;
                        break;
                    case "Business":
                        price = 10.90;
                        break;
                    case "Regular":
                        price = 15;
                        break;
                }
                break;
            case "Saturday":
                switch (typePeople) {
                    case "Students":
                        price = 9.8;
                        break;
                    case "Business":
                        price = 15.6;
                        break;
                    case "Regular":
                        price = 20;
                        break;
                }
                break;
            case "Sunday":
                switch (typePeople){
                    case "Students":
                        price = 10.46;
                        break;
                    case "Business":
                        price = 16;
                        break;
                    case "Regular":
                        price = 22.5;
                        break;
                }
                break;

        }
        double allPrice = numberOfPerson * price;
        if (typePeople.equals("Students")&&numberOfPerson>=30){
            allPrice = allPrice * 0.85;
        }else if (typePeople.equals("Business")&&numberOfPerson>=100){
            allPrice = allPrice - price * 10;
        }else if (typePeople.equals("Regular")&&numberOfPerson>=10&&numberOfPerson<=20){
            allPrice = allPrice * 0.95;
        }
        System.out.printf("Total price: %.2f",allPrice);
    }
}
