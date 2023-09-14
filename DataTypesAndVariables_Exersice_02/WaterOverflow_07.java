package DataTypesAndVariables_Exersice_02;

import java.util.Scanner;

public class WaterOverflow_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int fullTank = 0;

        for (int countQuantities = 0; countQuantities < n; countQuantities++) {
            int quantities = Integer.parseInt(scanner.nextLine());
            int capacity = 255;
            fullTank += quantities;
            if (fullTank > capacity){
                System.out.println("Insufficient capacity!");
                fullTank = fullTank - quantities;
            }
        }
        System.out.println(fullTank);
    }
}
