package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DeckOfCards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> cards = Arrays.stream(sc.nextLine().split(", ")).collect(Collectors.toList());
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= n; i++) {
            String[] input = sc.nextLine().split(", ");
            String commandType = input[0];
            String card;
            int index;
            switch (commandType) {
                case "Add":
                    card = input[1];
                    if (isInclusive(card, cards)) {
                        System.out.println("Card is already in the deck");
                    } else {
                        cards.add(card);
                        System.out.println("Card successfully added");
                    }
                    break;
                case "Remove":
                    card = input[1];
                    if (!isInclusive(card, cards)) {
                        System.out.println("Card not found");
                    } else {
                        cards.remove(card);
                        System.out.println("Card successfully removed");
                    }
                    break;
                case "Remove At":
                    index = Integer.parseInt(input[1]);
                    if (!isInRange(index, cards)) {
                        System.out.println("Index out of range");
                    } else {
                        cards.remove(index);
                        System.out.println("Card successfully removed");
                    }
                    break;
                case "Insert":
                    index = Integer.parseInt(input[1]);
                    card = input[2];
                    if (!isInRange(index, cards)) {
                        System.out.println("Index out of range");
                    } else if (isInRange(index, cards) && isInclusive(card, cards)) {
                        System.out.println("Card is already added");
                    } else {
                        cards.add(index, card);
                        System.out.println("Card successfully added");
                    }
                    break;
            }
        }
        for (int i = 0; i < cards.size(); i++) {

            if (i != cards.size() - 1) {
                System.out.print(cards.get(i) + ", ");
            }else{
                System.out.print(cards.get(i));
            }
        }
    }

    private static boolean isInclusive(String currentCard, List<String> cards) {
        for (String card : cards) {
            if (currentCard.equals(card)) {
                return true;
            }

        }
        return false;
    }

    public static boolean isInRange(int index, List<String> cards) {
        return index >= 0 && index < cards.size();
    }
}
