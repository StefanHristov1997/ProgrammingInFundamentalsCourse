package Lists_Exersice_05;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppendArrays_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


       List<String> fisrtList = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());

        Collections.reverse(fisrtList);

        String noSpase = fisrtList.toString().replaceAll("\\s+", ",")
                                             .replaceAll("[\\[\\]]", "");


        List<String> newList = Arrays.stream(noSpase.split(",")).collect(Collectors.toList());
        newList.removeIf(e -> e.isEmpty());


        for (String number : newList){
            int realNumber= Integer.parseInt(number);
            System.out.print(realNumber + " ");
        }

    }
}
