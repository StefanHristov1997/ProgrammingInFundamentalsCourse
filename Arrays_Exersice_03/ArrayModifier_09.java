package Arrays_Exersice_03;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier_09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            if (command.contains("swap")) {
                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);

                int firstIndex = array[index1];
                int secondIndex = array[index2];

                array[index1] = secondIndex;
                array[index2] = firstIndex;
            }

            if (command.contains("multiply")) {
                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);

                int firstIndex = array[index1];
                int secondIndex = array[index2];

                int product = firstIndex * secondIndex;
                array[index1] = product;
            }

            if (command.contains("decrease")) {
                for (int index = 0; index <= array.length - 1; index++) {
                    array[index]--;
                }
            }
            command = scanner.nextLine();
        }

        for (int i = 0; i <= array.length - 1; i++) {
            int currentNum = array[i];
            if (i != array.length - 1) {
                System.out.print(currentNum + ", ");
            }else{
                System.out.print(currentNum);
            }
        }
    }
}
