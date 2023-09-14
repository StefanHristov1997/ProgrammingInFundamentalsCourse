package Arrays_Exersice_03;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] firstArr = new int[n];
        int[] secondArr = new int[n];

        for (int interations = 0; interations < n; interations++) {
            int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            if (interations % 2 != 0) {
                firstArr[interations] = array[1];
                secondArr[interations] = array[0];
            } else {
                firstArr[interations] = array[0];
                secondArr[interations] = array[1];
            }
        }
        for (int first : firstArr) {
            System.out.print(first + " ");
        }
        System.out.println();

        for (int second : secondArr) {
            System.out.print(second + " ");
        }
    }
}