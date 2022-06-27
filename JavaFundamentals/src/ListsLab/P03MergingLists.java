package ListsLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03MergingLists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> firstList = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> newList = new ArrayList<>();

        int minSize = Math.min(firstList.size(), secondList.size());

        for (int i = 0; i < minSize; i++) {
            int firstElement = firstList.get(i);
            int secondElement = secondList.get(i);
            newList.add(firstElement);
            newList.add(secondElement);
        }
        if (firstList.size() > secondList.size()) {
            List<Integer> sublistFirstList = firstList.subList(minSize, firstList.size());
            newList.addAll(sublistFirstList);
        } else {
            List<Integer> sublistSecondList = secondList.subList(minSize, secondList.size());
            newList.addAll(sublistSecondList);
        }
        getNumbersList(newList);
        //System.out.println(newList.toString().replaceAll("[\\[\\],]", ""));
    }

    private static void getNumbersList(List<Integer> num) {
        for (int element : num) {
            System.out.print(element + " ");
        }

    }

}

