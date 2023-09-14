package BasicSyntaxConditionalStatementsLoops_Exersice_01;

import java.util.Scanner;

public class Ages_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ages = Integer.parseInt(scanner.nextLine());

        if (ages <= 2) {
            System.out.print("baby");
        } else if (ages <= 13) {
            System.out.print("child");
        } else if (ages <= 19) {
            System.out.print("teenager");
        } else if (ages <= 65) {
            System.out.print("adult");
        } else {
            System.out.print("elder");
        }
    }
}
