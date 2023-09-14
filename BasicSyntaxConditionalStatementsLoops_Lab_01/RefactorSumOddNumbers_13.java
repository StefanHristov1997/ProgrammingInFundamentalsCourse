package BasicSyntaxConditionalStatementsLoops_Lab_01;

import java.util.Scanner;

public class RefactorSumOddNumbers_13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int number = 0;

        for (int i = 0; i < n; i++) {
            number = 2 * i + 1;
            System.out.println(number);
            sum += number;
        }
        System.out.printf("Sum: %d",sum);
    }
}
