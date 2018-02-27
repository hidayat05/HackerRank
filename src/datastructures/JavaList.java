package datastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @owner nurhidayat
 * @since 27/02/18.
 * https://www.hackerrank.com/challenges/java-list/problem
 */
public class JavaList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countList = scanner.nextInt();

        List<Integer> itemList = new ArrayList<>();
        for (int i = 0; i < countList; i++) {
            int item = scanner.nextInt();
            itemList.add(i, item);
        }

        int countRequest = scanner.nextInt();
        for (int i = 0; i < countRequest; i++) {
            String request = scanner.next();
            if (request.toLowerCase().equals("insert")) {
                int index = scanner.nextInt();
                int value = scanner.nextInt();
                itemList.add(index, value);
            } else if (request.toLowerCase().equals("delete")) {
                int index = scanner.nextInt();
                itemList.remove(index);
            }
        }

        for (Integer item : itemList) {
            System.out.print (item + " ");
        }
    }
}
