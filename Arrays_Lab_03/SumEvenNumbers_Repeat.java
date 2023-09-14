package Arrays_Lab_03;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers_Repeat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int sum = 0;
        for (int index = 0; index <= arr.length - 1; index++) {
            int currentNumber = arr[index];

            if(currentNumber % 2 == 0){
                sum+= currentNumber;
            }
        }
        System.out.println(sum);
    }
}
