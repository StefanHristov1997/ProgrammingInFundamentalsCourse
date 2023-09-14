package DataTypesAndVariables_Exersice_02;

import java.util.Scanner;

public class Snowballs_11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Byte snowballs = Byte.parseByte(scanner.nextLine());

        short snowballSnow;
        short snowBallSnow = 0;
        short snowballTime;
        short snowBallTime = 0;
        short snowballQuality;
        int snowballValue;
        double result;
        double maxValue = Double.MIN_VALUE;
        int snowBallQuality = 0;

        for (int i = 1; i <= snowballs; i++) {
            snowballSnow = Short.parseShort(scanner.nextLine());
            snowballTime = Short.parseShort(scanner.nextLine());
            snowballQuality = Short.parseShort(scanner.nextLine());
            snowballValue = snowballSnow / snowballTime;
            result = Math.pow(snowballValue, snowballQuality);

            if (result > maxValue) {
                maxValue = result;
                snowBallQuality = snowballQuality;
                snowBallSnow = snowballSnow;
                snowBallTime = snowballTime;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", snowBallSnow, snowBallTime, maxValue, snowBallQuality);
    }
}
