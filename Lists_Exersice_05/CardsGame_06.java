package Lists_Exersice_05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        List<Integer> list1 = Arrays.stream(scanner.nextLine().split(" ")).
                map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(scanner.nextLine().split(" ")).
                map(Integer::parseInt).collect(Collectors.toList());

        while (true) {


            int firstCard = list1.get(0);
            int secondCard = list2.get(0);

            if (firstCard > secondCard) {

                list1.add(firstCard);
                list1.remove(list1.get(0));

                list1.add(secondCard);
                list2.remove(list2.get(0));

            } else if (secondCard > firstCard) {

                list2.add(secondCard);
                list2.remove(list2.get(0));

                list2.add(firstCard);
                list1.remove(list1.get(0));

            } else {
                list1.remove(list1.get(0));
                list2.remove(list2.get(0));
            }

            if(list1.isEmpty()){
                break;
            }else if (list2.isEmpty()){
                break;
            }
        }

        int sum = 0;

        if (list1.size() > list2.size()) {
            for (int el1 : list1) {
                sum += el1;
            }
            System.out.printf("First player wins! Sum: %d" ,sum);
        }else {
            for (int el1 : list2){
                sum += el1;
            }
            System.out.printf("Second player wins! Sum: %d" ,sum);
        }

    }
}

