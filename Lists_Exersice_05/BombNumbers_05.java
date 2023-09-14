package Lists_Exersice_05;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> inputList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());


        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int specialNumber = array[0];
        int power = array[1];

        while (inputList.contains(specialNumber)) {
            int bombIndex = inputList.indexOf(specialNumber);

            int start = Math.max(bombIndex - power, 0);
            int end = Math.min(bombIndex + power, inputList.size() - 1);

            for (int i = start; i <= end; i++) {
                inputList.remove(start);
            }
        }

        int sum = 0;

        for (int el1 : inputList) {
            sum += el1;
        }

        System.out.println(sum);
    }
}