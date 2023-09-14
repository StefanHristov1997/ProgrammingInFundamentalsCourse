package Arrays_Exersice_03;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers_Repeat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int biggerNumber = 0;

        for (int index = 0; index <= array.length - 1; index++) {
            boolean isBigger = true;
            int currentNumber = array[index];
            for (int i = index + 1; i <= array.length - 1; i++) {
                int numberAfter = array[i];
                if (currentNumber <= numberAfter){
                    isBigger = false;
                    break;
                }
            }
            if(isBigger){
                System.out.print(currentNumber + " ");
            }
        }
    }
}


