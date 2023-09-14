package Lists_Lab_04;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        List<Integer> inputList = Arrays.stream(scanner.nextLine().split(" ")).
                map(Integer::parseInt).collect(Collectors.toList());

        while (true) {
            String command = scanner.nextLine();

            if (command.equals("end")) {
                break;
            }

            String[] token = command.split(" ");

            switch (token[0]) {
                case "Add":
                    int numberToAdd = Integer.parseInt(token[1]);
                    inputList.add(numberToAdd);
                    break;
                case "Remove":
                    int numberToRemove = Integer.parseInt(token[1]);
                    inputList.remove(Integer.valueOf(numberToRemove));
                    break;
                case "RemoveAt":
                    int removeIndex = Integer.parseInt(token[1]);
                    inputList.remove(removeIndex);
                    break;
                case "Insert":
                    int numberToInsert = Integer.parseInt(token[1]);
                    int indexInsert = Integer.parseInt(token[2]);
                    inputList.add(indexInsert, numberToInsert);
                    break;
            }
        }

        System.out.println(inputList.toString().replaceAll("[\\[\\],]", ""));
    }
}
