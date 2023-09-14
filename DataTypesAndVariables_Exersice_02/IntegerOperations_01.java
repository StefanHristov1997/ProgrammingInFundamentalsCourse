package DataTypesAndVariables_Exersice_02;

import java.util.Scanner;

public class IntegerOperations_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());
        int fourNumber = Integer.parseInt(scanner.nextLine());

        int sum = firstNumber + secondNumber;
        int divide = sum / thirdNumber;
        int result = divide * fourNumber;

        System.out.println(result);

    }
}
