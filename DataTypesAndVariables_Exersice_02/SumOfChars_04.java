package DataTypesAndVariables_Exersice_02;

import java.util.Scanner;

public class SumOfChars_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int result = 0;
        for (int i = 0; i < n; i++) {
            char letters = scanner.nextLine().charAt(0);

            result = result + letters;
        }

        System.out.printf("The sum equals: %d",result);
    }
}
