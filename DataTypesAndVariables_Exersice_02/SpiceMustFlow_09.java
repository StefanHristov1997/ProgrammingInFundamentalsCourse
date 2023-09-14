package DataTypesAndVariables_Exersice_02;

import java.util.Scanner;

public class SpiceMustFlow_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());
        int totalAmount = 0;
        int countDays = 0;

        while (startingYield >= 100) {
            countDays++;
            int consumeWorkers = startingYield - 26;
            totalAmount += consumeWorkers;
            startingYield -= 10;
            if (totalAmount < 26) {
                consumeWorkers = 0;
            } else if (startingYield < 100) {
                totalAmount -= 26;
            }
        }
        System.out.println(countDays);
        System.out.println(totalAmount);
    }
}
