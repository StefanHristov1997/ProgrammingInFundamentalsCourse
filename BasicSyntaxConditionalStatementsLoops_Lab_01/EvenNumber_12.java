package BasicSyntaxConditionalStatementsLoops_Lab_01;

import java.util.Scanner;

public class EvenNumber_12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());

        while (number % 2 != 0) {
            System.out.println("Please write an even number.");

            number = Double.parseDouble(scanner.nextLine());
        }
        System.out.printf("The number is: %.0f",Math.abs(number));
    }
}
