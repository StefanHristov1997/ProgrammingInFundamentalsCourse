package Arrays_Lab_03;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber_Repeat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int[] newArr = new int[arr.length - 1];

        for (int index = 0; index < arr.length; index++) {

            if (arr.length == 1) {
                break;
            }

            if (index == arr.length - 1) {
                int[] condenseArr = new int[newArr.length - 1];
                index = -1;
                arr = newArr;
                newArr = condenseArr;
            } else {
                newArr[index] = arr[index] + arr[index + 1];
            }
        }
        System.out.println(arr[0]);

    }
}
