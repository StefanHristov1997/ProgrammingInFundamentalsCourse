package DataTypesAndVariables_Exersice_02;

import java.util.Scanner;

public class SumDigits_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sumDigits = 0;

        while (n > 0) {
            int currentNumber = n;
            currentNumber = currentNumber % 10;
            sumDigits = sumDigits + currentNumber;

            n = n / 10;
        }

        System.out.println(sumDigits);
    }
}
