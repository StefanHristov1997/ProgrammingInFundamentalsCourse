package BasicSyntaxConditionalStatementsLoops_Lab_01;

import java.util.Scanner;

public class BackIn30Minutes_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int sumMin = (hours * 60) + minutes + 30;
        int resultHour = sumMin / 60;
        int resultMin = sumMin % 60;

        if (resultHour > 23){
            resultHour = 0;
        }

        System.out.printf("%d:%02d", resultHour,resultMin);
    }
}
