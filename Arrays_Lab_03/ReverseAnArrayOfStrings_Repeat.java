package Arrays_Lab_03;

import java.util.Scanner;

public class ReverseAnArrayOfStrings_Repeat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] arr = scanner.nextLine().split(" ");

        for (int index = arr.length - 1; index >= 0; index--) {
            System.out.print(arr[index] + " ");
        }
    }
}
