package Arrays_Exersice_03;

import java.util.Scanner;

public class CommonElements_Repeat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] firstArr = scanner.nextLine().split(" ");
        String[] secondArr = scanner.nextLine().split(" ");

        compareElements(firstArr,secondArr);

    }

    public static void compareElements(String[] first, String[] second) {

        for (String el1 : second) {
            for (String el2 : first) {
                if (el1.equals(el2)){
                    System.out.print(el1 + " ");
                }
            }
        }
    }
}
