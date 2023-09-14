package Lists_Lab_04;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int rotations = numbers.size() / 2;

        for (int index = 0; index < rotations; index++) {
            int firstNum = numbers.get(index);
            int secondNum = numbers.get(numbers.size() - 1);

            int sum = firstNum + secondNum;

            numbers.set(index, sum);

            numbers.remove(numbers.size() - 1);
        }

        for (int el1 : numbers) {
            System.out.print(el1 + " ");
        }
    }
}
