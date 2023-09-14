package BasicSyntaxConditionalStatementsLoops_Exersice_01;

import java.util.Scanner;

public class PrintSum_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = firstNumber; i <= secondNumber; i++) {
            System.out.print(i + " ");
            sum+= i;
        }
        System.out.printf("\nSum: %d", sum);
    }
}
