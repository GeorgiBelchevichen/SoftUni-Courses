package ArraysExercise;

import java.util.Scanner;

public class P10TreasureHunt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] loot = sc.nextLine().split("\\|");
        String command = sc.nextLine();
        while (!command.equals("Yohoho!")) {
            String[] commandParts = command.split(" ");
            String commandType = commandParts[0];
            switch (commandType) {
                case "Loot":
                    for (int i = 1; i < commandParts.length; i++) {
                        boolean alreadyContained = false;
                        for (String s : loot) {
                            if (commandParts[i].equals(s)) {
                                alreadyContained = true;
                                break;
                            }
                        }
                        if (!alreadyContained) {
                            String newLoot = commandParts[i] + " " + String.join(" ", loot);
                            loot = newLoot.split(" ");
                        }
                    }
                    break;
                case "Drop":
                    int index = Integer.parseInt(commandParts[1]);
                    if (index > 0 && index < loot.length - 1) {
                        String lootStart = loot[index];
                        for (int i = index; i < loot.length - 1; i++) {
                            loot[i] = loot[i + 1];
                        }
                        loot[loot.length - 1] = lootStart;
                    }else {
                        break;
                    }
                    break;
                case "Steal":
                    int numberOfSteelingItems = Integer.parseInt(commandParts[1]);
                    //ако откраднатите елемементи са по малко или равни на елементите в масива
                    if (numberOfSteelingItems < loot.length) {
                        //String[] steelingLoot = new String[numberOfSteelingItems];
                        for (int i = 0; i < numberOfSteelingItems; i++) {
                            System.out.print(loot[loot.length - numberOfSteelingItems + i]);
                            if (i != numberOfSteelingItems - 1) {
                                System.out.print(", ");
                            }
                        }
                        String[] tempLoot = new String[loot.length - numberOfSteelingItems];
                        System.arraycopy(loot, 0, tempLoot, 0, tempLoot.length);
                        loot = tempLoot;
                    } else if (numberOfSteelingItems >= loot.length) {
                        for (int i = 0; i < loot.length; i++) {
                            System.out.print(loot[i]);
                            if (i != loot.length - 1) {
                                System.out.print(", ");
                            }
                        }
                        loot = new String[0];
                    }
                    System.out.println();
                    break;
            }

            command = sc.nextLine();
        }
        String treasureCount = String.join("", loot);
        int charCounter = 0;
        for (int i = 0; i < treasureCount.length(); i++) {
            charCounter++;
        }
        double averageTreasure = (1.0 * charCounter) / loot.length;
        if (charCounter > 0) {
            System.out.printf("Average treasure gain: %.2f pirate credits.", averageTreasure);
        } else {
            System.out.println("Failed treasure hunt.");
        }
    }

}






