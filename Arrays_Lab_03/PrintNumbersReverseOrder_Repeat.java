package Arrays_Lab_03;

import java.util.Scanner;

public class PrintNumbersReverseOrder_Repeat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            arr[i] = number;
        }

        for (int index = arr.length - 1; index >= 0; index--) {
            System.out.print(arr[index] + " ");
        }
    }
}

