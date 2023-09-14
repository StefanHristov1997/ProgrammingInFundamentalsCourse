package Lists_Exersice_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberCommands = Integer.parseInt(scanner.nextLine());

        List<String> guests = new ArrayList<>();


        for (int index = 0; index < numberCommands; index++) {
            String command = scanner.nextLine();
            String[] commandArr = command.split(" ");
            String name = commandArr[0];

            if (command.contains("is going")) {
                if (guests.contains(name)) {
                    System.out.println(name + " is already in the list!");
                } else {
                    guests.add(name);
                }
            }
            if (command.contains("is not going")) {
                if (guests.contains(name)) {
                    guests.remove(name);
                } else {
                    System.out.println(name + " is not in the list!");
                }
            }
        }

        for (String guest : guests) {
            System.out.println(guest);
        }

    }
}

