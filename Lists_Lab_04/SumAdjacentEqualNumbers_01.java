package Lists_Lab_04;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Double> numberList = Arrays.stream(scanner.nextLine().split(" ")).
                map(Double::parseDouble).
                collect(Collectors.toList());

        for (int index = 0; index < numberList.size() - 1; index++) {
            double currentNum = numberList.get(index);
            double nextNum = numberList.get(index + 1);

            if (currentNum == nextNum) {
                numberList.set(index, currentNum + nextNum);
                numberList.remove(index + 1);
                index = -1;
            }
        }
        System.out.println(resultFormat(" ", numberList) + " ");
    }

    public static String resultFormat(String delimeter, List<Double> list) {

        DecimalFormat df = new DecimalFormat("0.#");

        String result = "";
        for (double item : list) {
            String number = df.format(item) + delimeter;
            result += number;
        }
        return result;
    }
}
