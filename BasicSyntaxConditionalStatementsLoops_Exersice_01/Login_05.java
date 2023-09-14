package BasicSyntaxConditionalStatementsLoops_Exersice_01;

import java.util.Scanner;

public class Login_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String correctPassword = "";

        for (int i = username.length() - 1; i >= 0; i--) {
            char password = username.charAt(i);
            correctPassword += password;
        }
        String nextPassword = scanner.nextLine();
        int counterWrongPassword = 0;

        while (!nextPassword.equals(correctPassword)){
            counterWrongPassword++;

            if (counterWrongPassword >= 4){
                System.out.printf("User %s blocked!",username);
                break;
            }

            System.out.println("Incorrect password. Try again.");
            nextPassword = scanner.nextLine();
        }

        if (nextPassword.equals(correctPassword)){
            System.out.printf("User %s logged in.",username);
        }
    }
}
