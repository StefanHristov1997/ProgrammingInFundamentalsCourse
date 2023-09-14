package BasicSyntaxConditionalStatementsLoops_Exersice_01;

import java.util.Scanner;

public class VendingMachine_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        double sumCoins = 0;
        double price = 0;

        while (!command.equals("Start")) {
            double coins = Double.parseDouble(command);
            if (coins != 0.10 && coins != 0.20 && coins != 0.50 && coins != 1 && coins != 2) {
                System.out.printf("\nCannot accept %.2f", coins);
                command = scanner.nextLine();
                continue;
            }
            sumCoins = sumCoins + coins;
            command = scanner.nextLine();
        }
        command = scanner.nextLine();

        while (!command.equals("End")) {
            switch (command) {
                case "Nuts":
                    price = 2;
                    if (sumCoins >= price){
                        System.out.println("Purchased Nuts");
                        sumCoins = sumCoins - price;
                    }else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":
                    price = 0.7;
                    if (sumCoins >= price){
                        System.out.println("Purchased Water");
                        sumCoins = sumCoins - price;
                    }else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps":
                    price = 1.5;
                    if (sumCoins >= price){
                        System.out.println("Purchased Crisps");
                        sumCoins = sumCoins - price;
                    }else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":
                    price = 0.8;
                    if (sumCoins >= price){
                        System.out.println("Purchased Soda");
                        sumCoins = sumCoins - price;
                    }else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Coke":
                    price = 1;
                    if (sumCoins >= price){
                        System.out.println("Purchased Coke");
                        sumCoins = sumCoins - price;
                    }else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.printf("Change: %.2f",sumCoins);
    }
}
