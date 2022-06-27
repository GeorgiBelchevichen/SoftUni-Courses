package BasicSyntaxLab;

import java.util.Scanner;

public class P04BackIn30Minutes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hours = Integer.parseInt(sc.nextLine());
        int minutes = Integer.parseInt(sc.nextLine());
        int allMinutes = hours * 60 + minutes + 30;
        int hour = allMinutes / 60;
        int minutesAfter30 = allMinutes % 60;
        if (hour > 23){
            hour = 0;
        }
        System.out.printf("%d:%02d",hour,minutesAfter30);
    }
}
