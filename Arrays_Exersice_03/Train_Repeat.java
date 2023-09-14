package Arrays_Exersice_03;

import java.util.Scanner;

public class Train_Repeat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wagons = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int [] arr = new int[wagons];

        for (int index = 0; index < wagons; index++) {
            int peopleInWagons = Integer.parseInt(scanner.nextLine());
            arr[index] = peopleInWagons;
            sum+= peopleInWagons;
        }

        for (int el1 : arr){
            System.out.print(el1 + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
