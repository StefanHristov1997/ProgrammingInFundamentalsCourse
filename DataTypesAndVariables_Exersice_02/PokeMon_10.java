package DataTypesAndVariables_Exersice_02;

import java.util.Scanner;

public class PokeMon_10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int power = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaust = Integer.parseInt(scanner.nextLine());

        int originalValue = power / 2;
        int countTargets = 0;

        while (power >= distance) {
            power -= distance;
            countTargets++;

            if (power == originalValue) {
                if(exhaust != 0){
                    power = power / exhaust;
                }
            }
        }
        System.out.println(power);
        System.out.println(countTargets);
    }
}
