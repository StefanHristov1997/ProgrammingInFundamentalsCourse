package BasicSyntaxConditionalStatementsLoops_Lab_01;

import java.util.Scanner;

public class MultiplicationTable_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        for (int i = secondNumber; i <= 10; i++) {
            System.out.printf("%d X %d = %d\n", firstNumber, i, firstNumber * i);
        }
        if (secondNumber > 10) {
            System.out.printf("%d X %d = %d", firstNumber, secondNumber, firstNumber * secondNumber);
        }
    }
}
