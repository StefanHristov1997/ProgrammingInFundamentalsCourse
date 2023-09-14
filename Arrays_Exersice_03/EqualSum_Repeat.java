package Arrays_Exersice_03;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSum_Repeat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] inputArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();


        for (int index = 0; index <= inputArr.length - 1; index++) {
            int currentNumber = inputArr[index];
            int rightSum = 0;
            int leftSum = 0;

            for (int right = index + 1; right <= inputArr.length - 1; right++) {
                rightSum += inputArr[right];
            }

            for (int left = 0; left < index ; left++) {
                leftSum+= inputArr[left];
            }

            if (rightSum == leftSum){
                System.out.println(index);
                return;
            }
        }

        System.out.println("no");
    }
}
