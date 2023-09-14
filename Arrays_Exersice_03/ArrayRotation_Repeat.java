package Arrays_Exersice_03;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation_Repeat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        int rotations = Integer.parseInt(scanner.nextLine());

        for (int rotation = 0; rotation < rotations; rotation++) {
            int firstElement = array[0];
            for (int index = 0; index < array.length - 1; index++) {
                array[index] = array[index + 1];
            }

            array[array.length - 1] = firstElement;
        }

        for (int el1 : array) {
            System.out.print(el1 + " ");
        }
    }
}
