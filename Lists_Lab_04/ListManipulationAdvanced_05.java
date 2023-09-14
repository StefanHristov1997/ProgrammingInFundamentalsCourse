package Lists_Lab_04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> inputList = Arrays.stream(scanner.nextLine().split(" ")).
                map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] token = command.split(" ");
            String firstPart = token[0];
            String secondPart = token[1];

            switch (firstPart) {
                case "Contains":
                    int numberToContain = Integer.parseInt(secondPart);
                    if (inputList.contains(numberToContain)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    switch (secondPart) {
                        case "even":
                            for (int el1 : inputList) {
                                if (el1 % 2 == 0) {
                                    System.out.print(el1 + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case "odd":
                            for (int el1 : inputList) {
                                if (el1 % 2 != 0) {
                                    System.out.print(el1 + " ");
                                }
                            }
                            System.out.println();
                            break;
                    }
                    break;
                case "Get":
                    int sum = 0;
                    for (int el1 : inputList) {
                        int currentNumber = el1;
                        sum += currentNumber;
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    String condition = secondPart;
                    int numberToCompare = Integer.parseInt(token[2]);

                    List<Integer> newList = getConditionNumbers(inputList, condition, numberToCompare);
                    System.out.print(newList.toString().replaceAll("[\\[\\],]", ""));
                    System.out.println();
                    break;
            }
            command = scanner.nextLine();
        }
    }

    public static List<Integer> getConditionNumbers(List<Integer> initList, String condition, int number) {
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < initList.size(); i++) {
            int currentNum = initList.get(i);

            if (condition.equals("<")) {
                if (currentNum < number) {
                    resultList.add(currentNum);
                }
            } else if (condition.equals(">")) {
                if (currentNum > number) {
                    resultList.add(currentNum);
                }
            } else if (condition.equals("<=")) {
                if (currentNum <= number) {
                    resultList.add(currentNum);
                }
            } else if (condition.equals(">=")) {
                if (currentNum >= number) {
                    resultList.add(currentNum);
                }
            }
        }
        return resultList;
    }
}