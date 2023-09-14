package Lists_Exersice_05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> inputList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        int element = 0;
        while (!command.equals("end")) {
            String[] commandParts = command.split(" ");
            String action = commandParts[0];

            switch (action) {
                case "Delete":
                    element = Integer.parseInt(commandParts[1]);
                    deleteAction(inputList, element);
                    break;
                case "Insert":
                    element = Integer.parseInt(commandParts[1]);
                    int position = Integer.parseInt(commandParts[2]);
                    insertAction(inputList, element, position);
                    break;
            }
            command = scanner.nextLine();
        }

        System.out.println(inputList.toString().replaceAll("[\\[\\],]", ""));
    }

    public static List<Integer> deleteAction(List<Integer> input, int element) {

        input.removeIf(e -> e == element);

        return input;
    }

    public static List<Integer> insertAction(List<Integer> input, int element, int position) {

        input.add(position, element);

        return input;
    }
}
