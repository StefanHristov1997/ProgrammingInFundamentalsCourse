package DataTypesAndVariables_Lab_02;

import java.util.Scanner;

public class ConcatNames_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        String secondName = scanner.nextLine();
        String delimiter = scanner.nextLine();

        String result = String.format(firstName + delimiter + secondName);

        System.out.println(result);


    }
}
