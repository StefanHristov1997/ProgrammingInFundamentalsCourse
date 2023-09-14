package Arrays_Exersice_03;

import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.SocketHandler;

public class MaxSequenceOfEqualElements_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();


        int length = 1;
        int maxLength = 0;
        int startIndex = 0;
        int bestStartIndex = 0;

        for (int index = 1; index <= array.length - 1; index++) {
            if (array[index] == array[index - 1]) {
                length++;
            }else{
                length = 1;
                startIndex = index;
            }

            if (length > maxLength){
                maxLength = length;
                bestStartIndex = startIndex;
            }
        }
        for (int i = bestStartIndex; i < bestStartIndex + maxLength; i++) {
            System.out.print(array[i] + " ");
        }
    }
}


