package BasicSyntaxConditionalStatementsLoops_Exersice_01;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int group = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String day = scanner.nextLine();

        double price = 0;

        switch (typeOfGroup){
            case "Students":
                switch (day){
                    case "Friday":
                        price = group * 8.45;
                        if(group >= 30){
                            price = price - (price * 0.15);
                        }
                        break;
                    case "Saturday":
                        price = group * 9.80;
                        if(group >= 30){
                            price = price - (price * 0.15);
                        }
                        break;
                    case "Sunday":
                        price = group * 10.46;
                        if(group >= 30){
                            price = price - (price * 0.15);
                        }
                        break;
                }
                break;
            case "Business":
                switch (day){
                    case "Friday":
                        price = group * 10.90;
                        if(group >= 100){
                            group = group - 10;
                            price = group * 10.90;
                        }
                        break;
                    case "Saturday":
                        price = group * 15.60;
                        if(group >= 100){
                            group = group - 10;
                            price = group * 15.60;
                        }
                        break;
                    case "Sunday":
                        price = group * 16;
                        if(group >= 100){
                            group = group - 10;
                            price = group * 16;
                        }
                        break;
                }
                break;
            case "Regular":
                switch (day){
                    case "Friday":
                        price = group * 15;
                        if(group >= 10 && group <= 20){
                            price = price - (price * 0.05);
                        }
                        break;
                    case "Saturday":
                        price = group * 20;
                        if(group >= 10 && group <= 20){
                            price = price - (price * 0.05);
                        }
                        break;
                    case "Sunday":
                        price = group * 22.50;
                        if(group >= 10 && group <= 20){
                            price = price - (price * 0.05);
                        }
                        break;
                }
                break;
        }
        System.out.printf("Total price: %.2f",price);
    }
}
