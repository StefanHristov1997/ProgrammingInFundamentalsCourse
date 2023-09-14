package Arrays_Exersice_03;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum_Repeat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int[] Arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int magicNum = Integer.parseInt(scanner.nextLine());

        for (int index = 0; index <= Arr.length - 1; index++) {
            int currentNumber = Arr[index];
            for (int nextIndex = index + 1; nextIndex <= Arr.length - 1; nextIndex++) {
                int nextNumber = Arr[nextIndex];
                int sum = currentNumber + nextNumber;
                if(sum == magicNum){
                    System.out.println(currentNumber + " " + nextNumber);
                }
            }
        }
    }
}
