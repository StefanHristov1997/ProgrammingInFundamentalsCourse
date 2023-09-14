package BasicSyntaxConditionalStatementsLoops_Lab_01;

import java.util.Scanner;

public class TheatrePromotion_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String typeOfDay = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        double price = 0;

        if (age >= 0 && age <= 18) {
            switch (typeOfDay) {
                case "Weekday":
                    price = 12;
                    System.out.printf("%.0f$",price);
                    break;
                case "Weekend":
                    price = 15;
                    System.out.printf("%.0f$",price);
                    break;
                case "Holiday":
                    price = 5;
                    System.out.printf("%.0f$",price);
                    break;
            }
        } else if (age > 18 && age <= 64) {
            switch (typeOfDay) {
                case "Weekday":
                    price = 18;
                    System.out.printf("%.0f$",price);
                    break;
                case "Weekend":
                    price = 20;
                    System.out.printf("%.0f$",price);
                    break;
                case "Holiday":
                    price = 12;
                    System.out.printf("%.0f$",price);
                    break;
            }
        } else if (age > 64 && age <= 122) {
            switch (typeOfDay) {
                case "Weekday":
                    price = 12;
                    System.out.printf("%.0f$",price);
                    break;
                case "Weekend":
                    price = 15;
                    System.out.printf("%.0f$",price);
                    break;
                case "Holiday":
                    price = 10;
                    System.out.printf("%.0f$",price);
                    break;
            }
        } else {
            System.out.println("Error!");
        }
    }
}
