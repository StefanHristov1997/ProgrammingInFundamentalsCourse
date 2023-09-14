package Arrays_Lab_03;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays_Repeat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] firstArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] secondArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int sum = 0;
        boolean isIndentical = true;
        int problemIndex = 0;

        for (int index = 0; index <= firstArr.length - 1; index++) {
            if (firstArr[index]==secondArr[index]){
                sum += firstArr[index];
            }else {
                problemIndex = index;
                isIndentical = false;
                break;
            }
        }

        if(isIndentical){
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }else {
            System.out.printf("Arrays are not identical. Found difference at %d index.", problemIndex);
        }
    }
}
