package Arrays_Exersice_03;

import java.util.Scanner;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        int sum = 0;
        for (int i = 0; i < n; i++) {
            int people = Integer.parseInt(scanner.nextLine());
            int[] arr = new int[1];
            arr[0] = people;
            System.out.printf("%d ", arr[0]);
            System.out.printf("%d ", people);
            sum += arr[0];
        }
        System.out.println();
        System.out.println(sum);
    }
}
