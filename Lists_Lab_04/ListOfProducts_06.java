package Lists_Lab_04;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListOfProducts_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<String> productList = new ArrayList<>();

        for (int index = 0; index < n; index++) {
            String product = scanner.nextLine();

            productList.add(product);
        }

        Collections.sort(productList);

        for (int i = 0; i < productList.size(); i++) {
            System.out.printf("%d.%s\n", i + 1, productList.get(i));
        }
    }
}
