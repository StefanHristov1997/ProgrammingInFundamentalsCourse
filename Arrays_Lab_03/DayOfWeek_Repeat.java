package Arrays_Lab_03;

import java.util.Scanner;

public class DayOfWeek_Repeat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        String[] arr = {"Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday", "Sunday"};

        switch (number){
            case 1:
                System.out.println(arr[0]);
                break;
            case 2:
                System.out.println(arr[1]);
                break;
            case 3:
                System.out.println(arr[2]);
                break;
            case 4:
                System.out.println(arr[3]);
                break;
            case 5:
                System.out.println(arr[4]);
                break;
            case 6:
                System.out.println(arr[5]);
                break;
            case 7:
                System.out.println(arr[6]);
                break;
            default:
                System.out.println("Invalid day!");
        }
    }
}
