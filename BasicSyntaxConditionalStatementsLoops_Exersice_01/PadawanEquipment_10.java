package BasicSyntaxConditionalStatementsLoops_Exersice_01;

import java.util.Scanner;

public class PadawanEquipment_10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double priceLightSabers = Double.parseDouble(scanner.nextLine());
        double priceRobes = Double.parseDouble(scanner.nextLine());
        double priceBelts = Double.parseDouble(scanner.nextLine());

        double finalLightSabers = Math.ceil(students + (students * 0.1));
        int belts = students / 6;
        int finalBelts = students - belts;

        double sumPrice = (finalLightSabers * priceLightSabers) + (students * priceRobes) + (finalBelts * priceBelts);
        double sumDiff = Math.abs(sumPrice - money);

        if (money >= sumPrice) {
            System.out.printf("The money is enough - it would cost %.2flv.", sumPrice);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", sumDiff);
        }


    }
}
