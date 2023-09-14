package Arrays_Exersice_03;

import java.util.Scanner;

public class ArrayRotation_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split(" ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int rotations = 1; rotations <= n; rotations++) {
            String oldElement = array[0];

            for (int index = 0; index < array.length - 1; index++) {
                array[index] = array[index + 1];
            }
            array[array.length - 1] = oldElement;
        }
        for (String elements: array){
            System.out.print(elements + " ");
        }
    }
}
