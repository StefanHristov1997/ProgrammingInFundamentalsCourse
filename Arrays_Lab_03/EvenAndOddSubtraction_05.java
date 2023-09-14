package Arrays_Lab_03;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String[] inputArr = scanner.nextLine().split(" ");

        int[] numArr = new int[inputArr.length];

        int oddSum = 0;
        int evenSum = 0;

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = Integer.parseInt(inputArr[i]);

            if (numArr[i] % 2 == 0) {
                oddSum += numArr[i];
            }else {
                evenSum+= numArr[i];
            }
        }
        System.out.println(oddSum - evenSum);
    }
}
