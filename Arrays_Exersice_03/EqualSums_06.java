package Arrays_Exersice_03;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int index = 0; index <= numbers.length - 1; index++) {
            int currentNum = numbers[index];

            int rightSum = 0;
            int leftSum = 0;

            for (int right = index + 1; right <= numbers.length - 1; right++) {
                rightSum += numbers[right];
            }

            for (int left = 0; left < index; left++) {
                leftSum += numbers[left];
            }
            if (rightSum == leftSum) {
                System.out.println(index);
                return;
            }
        }
        System.out.println("no");
    }
}
