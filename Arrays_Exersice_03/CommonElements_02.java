package Arrays_Exersice_03;

import java.util.Scanner;

public class CommonElements_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] firstArr = scanner.nextLine().split(" ");
        String[] secondArr = scanner.nextLine().split(" ");

        for (String el2 : secondArr) {
            for (String el1 : firstArr){
                if (el1.equals(el2)){
                    System.out.print(el1 + " ");
                }
            }
        }
    }
}
