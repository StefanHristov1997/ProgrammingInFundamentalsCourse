package Arrays_Exersice_03;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays_Repeat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] firstArr = new int[n];
        int[] secondArr = new int[n];


        for (int index = 1; index <= n; index++) {
            int[] numberArr = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();

            if (index % 2 != 0) {
                firstArr[index - 1] = numberArr[0];
                secondArr[index - 1] = numberArr[1];
            } else {
                firstArr[index - 1] = numberArr[1];
                secondArr[index - 1] = numberArr[0];
            }
        }
        for (int el1 : firstArr) {
            System.out.print(el1 + " ");
        }

        System.out.println();

        for (int el2 : secondArr) {
            System.out.print(el2 + " ");
        }
    }
}
