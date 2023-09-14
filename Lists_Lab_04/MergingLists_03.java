package Lists_Lab_04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());


        List<Integer> resultList = new ArrayList<>();


        int minSize = Math.min(firstList.size(), secondList.size());

        for (int index = 0; index < minSize; index++) {
            int firstNum = firstList.get(index);
            int secondNum = secondList.get(index);


            resultList.add(firstNum);
            resultList.add(secondNum);
        }

        if (firstList.size() > secondList.size()){
            List<Integer> subList = firstList.subList(minSize, firstList.size());
            resultList.addAll(subList);
        }else if (secondList.size() > firstList.size()) {
            List<Integer> secondSubList = secondList.subList(minSize,secondList.size());
            resultList.addAll(secondSubList);
        }

        System.out.println(resultList.toString().replaceAll("[\\[\\],]", ""));
    }
}