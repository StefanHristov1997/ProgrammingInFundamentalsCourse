package Arrays_Exersice_03;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numberArr = Arrays.
                stream(scanner.nextLine().split(" ")).
                mapToInt(e -> Integer.parseInt(e)).toArray();


        for (int index = 0; index < numberArr.length; index++) {
            int currentNumber = numberArr[index];
            boolean isBigger = true;
            for (int i = index + 1; i <= numberArr.length - 1; i++) {
                int numberAfter = numberArr[i];
                if (currentNumber <= numberAfter) {
                    isBigger = false;
                    break;
                }
            }
            if (isBigger) {
                System.out.print(currentNumber + " ");
            }
        }
    }
}

