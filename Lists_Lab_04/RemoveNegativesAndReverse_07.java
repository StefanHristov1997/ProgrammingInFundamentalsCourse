package Lists_Lab_04;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> inputList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        inputList.removeIf(integer -> integer < 0);

        Collections.reverse(inputList);

        boolean listEmpty = inputList.isEmpty();

        if (listEmpty) {
            System.out.println("empty");
        } else {
            System.out.println(inputList.toString().replaceAll("[\\[\\]\\,]", ""));
        }

    }
}
