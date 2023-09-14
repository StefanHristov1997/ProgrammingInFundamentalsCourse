package Arrays_Lab_03;

import java.util.Scanner;

public class PrintNumbersReversOrder_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] numbersArr = new int[n];

        for (int i = 0; i < numbersArr.length; i++) {
            numbersArr[i] =Integer.parseInt(scanner.nextLine());
        }

        for (int j = numbersArr.length -1 ; j >= 0 ; j--) {
            System.out.printf("%d ",numbersArr[j]);
        }
    }
}
