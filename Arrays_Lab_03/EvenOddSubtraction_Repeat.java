package Arrays_Lab_03;

import java.util.Arrays;
import java.util.Scanner;

public class EvenOddSubtraction_Repeat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int oddSum = 0;
        int evenSum = 0;
        int result = 0;

        for (int index = 0; index <= arr.length - 1; index++) {
            int currentNumber = arr[index];

            if (currentNumber % 2 != 0) {
                oddSum += currentNumber;
            } else {
                evenSum += currentNumber;
            }
            result = evenSum - oddSum;
        }

        System.out.println(result);
    }
}
