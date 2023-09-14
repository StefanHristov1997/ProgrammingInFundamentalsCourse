package Arrays_Lab_03;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();


        String[] inputArr = input.split(" ");
        int[] numbersArr = new int[inputArr.length];
        //int[] numbersArr = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();

        int sum = 0;
        for (int i = 0; i < numbersArr.length; i++) {
            numbersArr[i] = Integer.parseInt(inputArr[i]);
            if (numbersArr[i] % 2 == 0) {
                sum += numbersArr[i];
            }
        }
        System.out.println(sum);
    }
}
