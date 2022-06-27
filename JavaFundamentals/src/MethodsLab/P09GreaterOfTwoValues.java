package MethodsLab;

import java.util.Scanner;

public class P09GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String command = sc.nextLine();
        switch (command){
            case "int":
                int firstNum = Integer.parseInt(sc.nextLine());
                int secondNum = Integer.parseInt(sc.nextLine());
                System.out.println(getMax(firstNum,secondNum));
                break;
            case "char":
                char firstChar = sc.nextLine().charAt(0);
                char secondChar = sc.nextLine().charAt(0);
                System.out.println(getMax(firstChar,secondChar));
                break;
            case "string":
                String firstLine = sc.nextLine();
                String secondLine = sc.nextLine();
                System.out.println(getMax(firstLine,secondLine));
                break;
        }
    }

    public static int getMax(int firstNum, int secondNum) {
        if (firstNum > secondNum) {
            return firstNum;
        } else {
            return secondNum;
        }
    }

    public static char getMax(char firstSymbol, char secondSymbol) {
        if (firstSymbol > secondSymbol) {
            return firstSymbol;
        } else {
            return secondSymbol;
        }
    }
    public static String getMax(String firstLine,String secondLine){
        if (firstLine.compareTo(secondLine)>0){
            return firstLine;
        }
        else{
            return secondLine;
        }
    }
}
