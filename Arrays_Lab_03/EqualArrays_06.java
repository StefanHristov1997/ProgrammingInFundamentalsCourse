package Arrays_Lab_03;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstArr = Arrays.
                stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).
                toArray();
        int[] secondArr = Arrays.
                stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).
                toArray();

        int[] maxArr = new int[secondArr.length];

        int sum = 0;
        boolean isIdentical = true;
        int indexDiff = 0;

        for (int i = 0; i < maxArr.length; i++) {
            sum += firstArr[i];

            if (firstArr[i] != secondArr[i]) {
                isIdentical = false;
                indexDiff = i;
                break;
            }
        }

        if(isIdentical){
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }else {
            System.out.printf("Arrays are not identical. Found difference at %d index.", indexDiff);
        }
    }
}
